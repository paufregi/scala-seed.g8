import sbt._
import lab.acme.projectutils._
import lab.acme.projectutils.Dependencies._

lazy val root = project
  .basic(".", "$name$", "$organization$")
  .withLibraries(
    typesafeConfig,
    scalaLogging
  )
  .withTestLibraries(scalatest)
