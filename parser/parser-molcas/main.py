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

    def startedParsing(self, fname, parser):
        pass

    def onClose_section_method(self, backend, gindex, section):
        pass  # DFT etc

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
               SM(r'\s*\*+\s*Cartesian Coordinates / Bohr, Angstrom\s*\*+',
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

mainFileDescription = SM(
    name='root',
    weak=True,
    startReStr='',
    fixedStartValues={'program_name': 'Molcas',
                      'program_basis_set_type': 'gaussians'},
    sections=['section_run'],
    subMatchers=[
        get_header_sm(),
        get_inputfile_echo_sm(),
        get_system_sm(),
        get_finalresults_sm(),
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
