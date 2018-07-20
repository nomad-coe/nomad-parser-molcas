# Copyright 2016-2018 Ask Hjorth Larsen, Fawzi Mohamed, Ankit Kariryaa
# 
#   Licensed under the Apache License, Version 2.0 (the "License");
#   you may not use this file except in compliance with the License.
#   You may obtain a copy of the License at
# 
#     http://www.apache.org/licenses/LICENSE-2.0
# 
#   Unless required by applicable law or agreed to in writing, software
#   distributed under the License is distributed on an "AS IS" BASIS,
#   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#   See the License for the specific language governing permissions and
#   limitations under the License.

#
# Main author and maintainer: Ask Hjorth Larsen <asklarsen@gmail.com>

from __future__ import print_function
from glob import glob
import re
from optparse import OptionParser
from subprocess import Popen, PIPE
import os
from ase.parallel import world
import platform

p = OptionParser()
opts, args = p.parse_args()

if len(args) == 0:
    testfiles = glob('test/test???.input.out')
    testfiles.sort()
else:
    testfiles = argv

for i, testfile in enumerate(testfiles):
    if i % world.size != world.rank:
        continue
    dirname, basename = os.path.split(testfile)
    py = 'python'
    if platform.node() == 'labdev-nomad':
        py = '/labEnv3/bin/python'
    args = [py, 'main.py', '--annotate']
    args.append(testfile)
    print(' '.join(args))
    proc = Popen(args, stdout=PIPE)
    txt = proc.stdout.read()
    with open('%s.json' % testfile, 'w') as fd:
        fd.write(txt.decode('ascii'))
