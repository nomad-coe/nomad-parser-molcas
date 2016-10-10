package eu.nomad_lab.parsers

import eu.nomad_lab.{ parsers, DefaultPythonInterpreter }
import org.scalacheck.Properties
import org.specs2.mutable.Specification
import org.{ json4s => jn }

object MolcasParserSpec extends Specification {
  "MolcasParserTest" >> {
    "test test000.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test000.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test000.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test001.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test001.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test001.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test002.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test002.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test002.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test003.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test003.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test003.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test004.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test004.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test004.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test005.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test005.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test005.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test006.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test006.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test006.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test007.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test007.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test007.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test008.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test008.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test008.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test009.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test009.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test009.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test010.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test010.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test010.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test011.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test011.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test011.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test012.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test012.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test012.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test013.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test013.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test013.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test014.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test014.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test014.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test015.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test015.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test015.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test016.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test016.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test016.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test017.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test017.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test017.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test018.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test018.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test018.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test019.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test019.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test019.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test020.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test020.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test020.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test021.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test021.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test021.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test022.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test022.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test022.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test023.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test023.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test023.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test024.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test024.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test024.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test025.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test025.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test025.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test026.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test026.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test026.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test027.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test027.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test027.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test028.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test028.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test028.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test029.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test029.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test029.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test030.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test030.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test030.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test031.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test031.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test031.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test032.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test032.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test032.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test033.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test033.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test033.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test034.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test034.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test034.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test036.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test036.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test036.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test037.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test037.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test037.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test038.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test038.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test038.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test039.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test039.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test039.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test040.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test040.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test040.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test041.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test041.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test041.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test042.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test042.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test042.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test043.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test043.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test043.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test044.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test044.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test044.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test045.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test045.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test045.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test046.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test046.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test046.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test047.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test047.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test047.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test048.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test048.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test048.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test049.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test049.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test049.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test050.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test050.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test050.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test051.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test051.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test051.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test052.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test052.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test052.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test053.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test053.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test053.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test054.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test054.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test054.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test900.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test900.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test900.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test901.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test901.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test901.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test902.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test902.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test902.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test903.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test903.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test903.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test904.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test904.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test904.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test905.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test905.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test905.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test906.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test906.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test906.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test907.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test907.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test907.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test908.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test908.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test908.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test909.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test909.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test909.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test910.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test910.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test910.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test911.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test911.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test911.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test912.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test912.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test912.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test914.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test914.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test914.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test915.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test915.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test915.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test916.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test916.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test916.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
    "test test917.input.out " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test917.input.out", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/test/test917.input.out", "json") must_== ParseResult.ParseSuccess
      }
    }
  }
}
