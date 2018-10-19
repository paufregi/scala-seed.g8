import lab.acme.projectutils._
import lab.acme.projectutils.Dependencies_

lazy val root = project
  .basic(".", "$name$", "$organization$")
  .withLibraries(
    typesafeConfig,
    scalaLogging
  )
  .withTestLibraries(scalatest)
