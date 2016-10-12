#!/labEnv3/bin/python
# XXXXX ugly hashbang
from __future__ import print_function
import os
import sys
import setup_paths
import re

import numpy as np
from ase import Atoms
from ase.spacegroup import crystal
#from ase.data import chemical_symbols

from nomadcore.simple_parser import mainFunction, SimpleMatcher as SM
from nomadcore.local_meta_info import loadJsonFile, InfoKindEl
from nomadcore.unit_conversion.unit_conversion \
    import register_userdefined_quantity, convert_unit

from functionals import functionals

metaInfoPath = os.path.normpath(os.path.join(os.path.dirname(os.path.abspath(__file__)),"../../../../nomad-meta-info/meta_info/nomad_meta_info/molcas.nomadmetainfo.json"))
metaInfoEnv, warnings = loadJsonFile(filePath=metaInfoPath,
                                     dependencyLoader=None,
                                     extraArgsHandling=InfoKindEl.ADD_EXTRA_ARGS,
                                     uri=None)

parser_info = {'name': 'molcas-parser', 'version': '1.0'}

# OK
#    "program_basis_set_type",
#    "program_name",
#    "program_version",
#    "configuration_periodic_dimensions"
#    "simulation_cell",  # molcas never has a cell



#    "atom_labels",
#    "atom_positions",
#    "energy_total",

#    'section_system',
#    'section_method',
#    'section_frame_sequence',
#    'section_sampling_method',
#    'single_configuration_to_calculation_method_ref',
#    'single_configuration_calculation_to_system_ref',
#    'atom_forces_raw',
#    'frame_sequence_local_frames_ref',
#    'frame_sequence_to_sampling_ref',

#    'XC_functional_name',
#    'smearing_kind',
#    'smearing_width'
#    'eigenvalues_kpoints',
#    'eigenvalues_values',
#    'eigenvalues_occupation',
#    'band_k_points',
#    'band_energies',
#    'band_segm_start_end',
#    'band_segm_labels',
#    'dos_energies',
#    'dos_values',
#    'section_XC_functionals',



class MolcasContext(object):
    def __init__(self):
        self.data = {}
        self.last_line = None
        self.current_module_name = None
        self.section_refs = {}

    def onOpen_section_method(self, backend, gindex, section):
        self.section_refs['method'] = gindex

    def onOpen_section_system(self, backend, gindex, section):
        self.section_refs['system'] = gindex

    def startedParsing(self, fname, parser):
        pass

    def adhoc_store_line(self, parser):
        self.last_line = parser.fIn.readline()

    def adhoc_pushback_last(self, parser):
        assert self.last_line is not None
        parser.fIn.pushbackLine(self.last_line)
        self.last_line = None

    def onClose_section_single_configuration_calculation(self, backend, gindex, section):
        backend.addValue('single_configuration_to_calculation_method_ref',
                         self.section_refs['method'])
        backend.addValue('single_configuration_calculation_to_system_ref',
                         self.section_refs['system'])

    def onClose_section_method(self, backend, gindex, section):
        #print('SECTION', section)
        #methods = section['x_molcas_method']
        xc = []

        methods = section['x_molcas_method_name']
        assert len(methods) == 1, methods
        method = methods[0]

        uhf = method.startswith('UHF ')
        if uhf:
            method = method[4:].strip()
        backend.addValue('x_molcas_uhf', uhf)

        if method == 'SCF':
            # XXX distinguish somehow between these two?
            esm = 'DFT'
            xc = ['HF_X']
        elif method in ['RASSCF', 'RAS-CI', 'CASPT2']:
            esm = method
        elif method in functionals:
            esm = 'DFT'
            xc = functionals[method]
            assert xc is not None, 'no xc: %s' % method
        else:
            raise ValueError('method: %s' % method)

        backend.addValue('electronic_structure_method', method)
        for xcfunc in xc:
            g = backend.openSection('section_XC_functionals')
            backend.addValue('XC_functional_name', xcfunc)
            backend.closeSection('section_XC_functionals', g)


        if 0:
            if methods is not None:
                assert len(methods) == 1
                method = methods[0]
                scfnames = section['x_molcas_method_name']
                assert len(scfnames) == 1, scfnames
                scfname = scfnames[0]
                if scfname == 'SCF':
                    backend.addValue('electronic_structure_method', 'DFT')
                    g = backend.openSection('section_XC_functionals')
                    backend.addValue('XC_functional_name', 'HF_X')
                    backend.closeSection('section_XC_functionals', g)

        #print(self.current_module_name)
        #scftype = section['x_molcas_method_name']
        #if scftype is not None:
        #    print('SCF', scftype)

    def onClose_section_system(self, backend, gindex, section):
        matrix = self.data.pop('coordinates')
        atom_labels = matrix[:, 1]
        coords = matrix[:, 2:5].astype(float)
        coords = convert_unit(coords, 'bohr')

        backend.addArrayValues('atom_labels', atom_labels)
        backend.addArrayValues('atom_positions', coords)
        backend.addArrayValues('configuration_periodic_dimensions', np.zeros(3, bool))

    # multi_sm copied from Siesta/GULP
    def multi_sm(self, name, startpattern, linepattern, endmatcher=None,
                 conflict='fail',  # 'fail', 'keep', 'overwrite'
                 *args, **kwargs):

        pat = re.compile(linepattern)  # XXX how to get compiled pattern?
        ngroups = pat.groups

        allgroups = []
        def addline(parser):
            line = parser.fIn.readline()
            match = pat.match(line)
            assert match is not None
            thislinegroups = match.groups()
            assert len(thislinegroups) == ngroups
            allgroups.append(thislinegroups)

        def savearray(parser):
            arr = np.array(allgroups, dtype=object)
            del allgroups[:]
            if name in self.data:
                if conflict == 'fail':
                    raise ValueError('grrr %s %s' % (name, self.data[name]))
                elif conflict == 'keep':
                    return  # Do not save array
                elif conflict == 'overwrite':
                    pass
                else:
                    raise ValueError('Unknown keyword %s' % conflict)
            #if arr.size > 0:
            if arr.size == 0:
                arr.shape = (0, ngroups)
            self.data[name] = arr

        if endmatcher is None:
            endmatcher = r'.*'

        if hasattr(endmatcher, 'swapcase'):
            endmatcher = SM(endmatcher,
                            endReStr='',
                            forwardMatch=True,
                            name='%s-end' % name,
                            adHoc=savearray)

        sm = SM(startpattern,
                name=name,
                subMatchers=[
                    SM(linepattern,
                       name='%s-line' % name,
                       repeats=True,
                       forwardMatch=True,
                       required=True,
                       adHoc=addline),
                    endmatcher,
                ], **kwargs)
        return sm

context = MolcasContext()

def get_inputfile_echo_sm():
    m = SM(r'\+\+\s*----+\s*Input file\s*---+',
           endReStr='--\s*-------+',
           sections=['section_method'],
           name='inputfile')
    return m


def get_system_sm():
    m = SM(r'\s*Molecular structure info:',
           name='structure',
           sections=['section_system'],
           subMatchers=[
               SM(r'\s*--------+', name='bar'),
               SM(r'.*?Cartesian Coordinates / Bohr, Angstrom\s*\*+',
                  name='coords',
                  subMatchers=[
                      context.multi_sm('coordinates',
                                       r'\s*Center\s*Label\s*x\s*y\s*z\s*x\s*y\s*z',
                                       r'\s*\d+\s*(\S+)\s*(\S+)\s*(\S+)\s*(\S+)')
                  ])
           ])
    return m


def get_finalresults_sm():  # Other modes than SCF/KS-DFT?
    m = SM(r'\s*\*\s*SCF/KS-DFT Program, Final results',
           endReStr='\s*Molecular Properties',  # No clue when to really stop matching this
           sections=['section_single_configuration_calculation'],
           name='results',
           subMatchers=[
               SM(r'\s*Total SCF energy\s*(?P<energy_total__eV>\S+)', name='etot')  # XXX eV?
           ])
    return m

def get_header_sm():
    m = SM(r'[\s^]*M O L C A S',
           endReStr=r'\s*For the author list and the recommended.*',
           name='header',
           subMatchers=[
               SM(r'[\s^]*version\s*(?P<program_version>.*?)\s*$',
                  name='version')
           ])
    return m

# Does not include 'auto'
molcas_modules = ('alaska|caspt2|casvb|ccsdt|cpf|expbas|ffpt|gateway|'
                  'genano|grid_it|guessorb|guga|last_energy|loprop|mbpt2|'
                  'mckinley|mclr|motra|mrci|numerical_gradient|rasscf|'
                  'rassi|scf|seward|slapaf|vibrot').split('|')

def get_anymodule_sms():
    sms = []
    for modulename in molcas_modules:
        sms.append(SM(r'--- Start Module:\s*%s' % modulename, name=modulename))
        #sms.append(SM(r'\s*MOLCAS executing module %s' % modulename.upper(),
        #              name=modulename))
    return sms

#def module_sm(name, *args, **kwargs):
#    m = SM(r'--- Start Module:\s*(%s)' % name, *args, name=name, **kwargs)
#    return m

# mw = "module-wrapper" for SM
# The idea is to guarantee that matchers modules that do not always write a proper header (e.g. SLAPAF)
# are invoked when the module starts, but that the matcher's sections are only opened if recognizable
# output is written (sometimes they write nothing).
#
# Typically, pass a matcher which opens some sections but will only match actual output of the module
# This wrapper will call the wrapped matcher when the module is started, but the wrapped matcher
# will only match if the output is actually there, and also will only open its sections in that case.
def mw(modname, *args, **kwargs):
    m = SM(r'--- Start Module:\s*%s' % modname,
           name=modname,
           subMatchers=[
               SM(*args, **kwargs)
           ])
    return m

def molcas_main_loop_sm():
    m = SM(r'--- Start Module:\s*(?:%s)' % '|'.join(molcas_modules),
           endReStr='--- Stop Module:',
           repeats=True,
           forwardMatch=True,
           name='module',
           subMatchers=[
               mw(r'(gateway|seward)',
                  r'\s*MOLCAS executing module (GATEWAY|SEWARD)', name='seward',
                  subMatchers=[
                      get_system_sm()
                  ]),
               mw(r'(?:ras)?scf', r'\s*MOLCAS executing module (?:SCF|RASSCF)', name='scf',
                  sections=['section_method', 'section_single_configuration_calculation'],
                  subMatchers=[
                      SM(r'\s*(?P<x_molcas_method_name>.*?)\s*iterations: Energy and convergence statistics',
                         name='scfiter'),
                      SM(r'\s*CI only, no orbital optimization',
                         fixedStartValues={'x_molcas_method_name': 'RAS-CI'}),
                      SM(r'\s*Total SCF energy\s*(?P<energy_total__hartree>\S+)', name='E-tot'),
                      SM(r'\s*RASSCF root number\s*\d+\s*Total energy\s*=\s*(?P<energy_total__hartree>\S+)', name='E-ras'),
                  ]),
               mw(r'caspt2', r'\s*MOLCAS executing module CASPT2',
                  name='caspt2',
                  sections=['section_method', 'section_single_configuration_calculation'],
                  fixedStartValues={'x_molcas_method_name': 'CASPT2'},
                  subMatchers=[
                      SM(r'\s*Total energy:\s*(?P<energy_total__hartree>\S+)', name='E-caspt2')
                  ]),
               mw(r'slapaf', r'\s*MOLCAS executing module (SLAPAF)|\s*Specification of the internal coordinates according to the user-defined',
                  name='slapaf',
                  subMatchers=[
                      SM(r'\*\s*Energy Statistics for Geometry Optimization',
                         name='opt-loop',
                         endReStr=r'\s*$',
                         sections=['section_single_configuration_calculation'],
                         subMatchers=[
                             SM(r'\s*\d+\s*\S+\s*', name='opt-iter', repeats=True, forwardMatch=True, adHoc=context.adhoc_store_line),
                             SM(r'\s*$', forwardMatch=True, adHoc=context.adhoc_pushback_last, name='pushback'),
                             SM(r'\s*\d+\s*(?P<energy_total__hartree>\S+)\s*', name='opt-iter', repeats=True),
                         ]),
                      SM(r'\s*\*\s*Nuclear coordinates for the next iteration / Bohr',
                         endReStr=r'\s*$',
                         name='newcoords',
                         sections=['section_system'],
                         subMatchers=[
                             context.multi_sm('coordinates',
                                              r'\s*ATOM\s*X\s*Y\s*Z',
                                              r'\s*(\S+)\s*(\S+)\s*(\S+)\s*(\S+)')
                             ])
                  ])
           ] + get_anymodule_sms())
    return m

mainFileDescription = SM(
    name='root',
    weak=True,
    startReStr='',
    fixedStartValues={'program_name': 'Molcas',
                      'program_basis_set_type': 'gaussians'},
    sections=['section_run'],
    subMatchers=[
        get_header_sm(),
        #get_inputfile_echo_sm(),
        molcas_main_loop_sm(),
        SM(r'x^',  # force parser to parse the whole file
           name='impossible')
    ])


def main(**kwargs):
    mainFunction(mainFileDescription=mainFileDescription,
                 metaInfoEnv=metaInfoEnv,
                 parserInfo=parser_info,
                 cachingLevelForMetaName={},
                 superContext=context,
                 **kwargs)

if __name__ == '__main__':
    main()
