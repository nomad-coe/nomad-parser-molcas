#
# Copyright The NOMAD Authors.
#
# This file is part of NOMAD. See https://nomad-lab.eu for further info.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

import pytest

from nomad.datamodel import EntryArchive
from molcasparser import MolcasParser


def approx(value, abs=0, rel=1e-6):
    return pytest.approx(value, abs=abs, rel=rel)


@pytest.fixture(scope='module')
def parser():
    return MolcasParser()


def test_basic(parser):
    archive = EntryArchive()

    parser.parse('tests/data/test000.input.out', archive, None)

    sec_run = archive.section_run[0]
    assert sec_run.program_version == '7.8 patchlevel 047'

    sec_system = archive.section_run[0].section_system[0]
    assert sec_system.atom_positions[1][0].magnitude == approx(-3.5e-11)
    assert sec_system.atom_labels == ['H', 'H']

    sec_sccs = sec_run.section_single_configuration_calculation[0]
    assert sec_sccs.energy_total.magnitude == approx(-4.89497079e-18)


def test_1(parser):
    archive = EntryArchive()

    parser.parse('tests/data/test003.input.out', archive, None)

    sec_sccs = archive.section_run[0].section_single_configuration_calculation
    assert len(sec_sccs) == 61
    assert sec_sccs[4].energy_total.magnitude == approx(-9.14252116e-15)
