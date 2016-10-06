package eu.nomad_lab.parsers

import eu.nomad_lab.{ parsers, DefaultPythonInterpreter }
import org.scalacheck.Properties
import org.specs2.mutable.Specification
import org.{ json4s => jn }

object MolcasParserSpec extends Specification {
  "MolcasParserTest" >> {
    "test example1.got " >> {
      "test with json-events" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/outputs/example1.got", "json-events") must_== ParseResult.ParseSuccess
      }
      "test with json" >> {
        ParserRun.parse(MolcasParser, "parsers/molcas/test/examples/outputs/example1.got", "json") must_== ParseResult.ParseSuccess
      }
    }
  }
}
