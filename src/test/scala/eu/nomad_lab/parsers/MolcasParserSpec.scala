/*
 * Copyright 2016-2018 Ask Hjorth Larsen, Fawzi Mohamed, Ankit Kariryaa
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package eu.nomad_lab.parsers

import eu.nomad_lab.{ parsers, DefaultPythonInterpreter }
import org.scalacheck.Properties
import org.specs2.mutable.Specification
import org.{ json4s => jn }

object MolcasParserSpec extends Specification {
  "MolcasParserTest" >> {
    "test test000.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test000.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test000.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test001.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test001.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test001.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test002.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test002.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test002.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test003.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test003.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test003.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test004.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test004.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test004.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test005.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test005.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test005.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test006.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test006.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test006.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test007.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test007.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test007.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test008.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test008.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test008.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test009.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test009.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test009.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test010.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test010.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test010.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test011.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test011.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test011.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test012.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test012.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test012.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test013.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test013.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test013.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test014.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test014.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test014.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test015.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test015.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test015.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test016.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test016.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test016.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test017.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test017.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test017.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test018.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test018.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test018.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test019.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test019.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test019.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test020.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test020.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test020.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test021.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test021.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test021.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test022.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test022.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test022.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test023.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test023.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test023.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test024.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test024.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test024.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test025.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test025.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test025.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test026.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test026.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test026.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test027.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test027.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test027.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test028.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test028.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test028.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test029.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test029.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test029.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test030.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test030.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test030.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test031.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test031.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test031.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test032.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test032.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test032.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test033.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test033.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test033.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test034.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test034.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test034.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test036.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test036.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test036.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test037.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test037.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test037.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test038.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test038.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test038.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test039.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test039.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test039.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test040.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test040.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test040.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test041.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test041.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test041.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test042.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test042.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test042.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test043.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test043.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test043.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test044.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test044.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test044.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test045.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test045.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test045.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test046.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test046.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test046.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test047.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test047.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test047.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test048.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test048.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test048.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test049.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test049.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test049.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test050.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test050.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test050.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test051.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test051.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test051.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test052.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test052.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test052.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test053.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test053.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test053.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test054.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test054.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test054.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test900.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test900.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test900.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test901.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test901.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test901.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test902.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test902.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test902.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test903.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test903.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test903.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test904.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test904.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test904.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test905.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test905.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test905.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test906.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test906.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test906.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test907.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test907.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test907.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test908.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test908.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test908.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test909.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test909.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test909.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test910.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test910.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test910.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test911.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test911.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test911.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test912.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test912.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test912.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test914.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test914.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test914.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test915.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test915.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test915.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test916.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test916.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test916.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test917.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test917.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test917.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
  }
}
