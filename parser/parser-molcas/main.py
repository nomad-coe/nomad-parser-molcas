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

class MolcasContext(object):
    def startedParsing(self, fname, parser):
        pass

context = MolcasContext()

mainFileDescription = SM(
    name='root',
    weak=True,
    startReStr='',
    fixedStartValues={'program_name': 'Molcas'},
    sections=['section_run'],
    subMatchers=[])

def main(**kwargs):
    mainFunction(mainFileDescription=mainFileDescription,
                 metaInfoEnv=metaInfoEnv,
                 parserInfo=parser_info,
                 cachingLevelForMetaName={},
                 superContext=context,
                 **kwargs)

if __name__ == '__main__':
    main()
