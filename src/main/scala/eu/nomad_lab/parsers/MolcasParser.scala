package eu.nomad_lab.parsers

import eu.{ nomad_lab => lab }
import eu.nomad_lab.DefaultPythonInterpreter
import org.{ json4s => jn }
import scala.collection.breakOut

object MolcasParser extends SimpleExternalParserGenerator(
  name = "MolcasParser",
  parserInfo = jn.JObject(
    ("name" -> jn.JString("MolcasParser")) ::
      ("parserId" -> jn.JString("MolcasParser" + lab.MolcasVersionInfo.version)) ::
      ("versionInfo" -> jn.JObject(
        ("nomadCoreVersion" -> jn.JObject(lab.NomadCoreVersionInfo.toMap.map {
          case (k, v) => k -> jn.JString(v.toString)
        }(breakOut): List[(String, jn.JString)])) ::
          (lab.MolcasVersionInfo.toMap.map {
            case (key, value) =>
              (key -> jn.JString(value.toString))
          }(breakOut): List[(String, jn.JString)])
      )) :: Nil
  ),
  mainFileTypes = Seq("text/.*"),
  mainFileRe = """Regex
for
molcas
mainfile
""".r,
  cmd = Seq(DefaultPythonInterpreter.pythonExe(), "${envDir}/parsers/molcas/parser/parser-molcas/main.py",
    "--uri", "${mainFileUri}", "${mainFilePath}"),
  resList = Seq(
    "parser-molcas/main.py",
    "parser-molcas/setup_paths.py",
    "nomad_meta_info/public.nomadmetainfo.json",
    "nomad_meta_info/common.nomadmetainfo.json",
    "nomad_meta_info/meta_types.nomadmetainfo.json",
    "nomad_meta_info/molcas.nomadmetainfo.json"
  ) ++ DefaultPythonInterpreter.commonFiles(),
  dirMap = Map(
    "parser-molcas" -> "parsers/molcas/parser/parser-molcas",
    "nomad_meta_info" -> "nomad-meta-info/meta_info/nomad_meta_info",
    "python" -> "python-common/common/python/nomadcore"
  ) ++ DefaultPythonInterpreter.commonDirMapping(),
  metaInfoEnv = Some(lab.meta.KnownMetaInfoEnvs.molcas)
)
