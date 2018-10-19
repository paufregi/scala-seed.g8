package lab.acme.projectutils

import sbt.Keys._
import sbt._

object DirectoryLayoutSettings {
  lazy val defaults = Seq(
    sourceDirectory in Compile := baseDirectory.value / "src" / "main",
    sourceDirectory in Test := baseDirectory.value / "src" /"test",
    sourceDirectory in IntegrationTest := baseDirectory.value / "src"/ "it",
    scalaSource in Compile := baseDirectory.value / "src" / "main",
    scalaSource in Test := baseDirectory.value / "src" /"test",
    scalaSource in IntegrationTest := baseDirectory.value / "src" / "it",
    resourceDirectory in Compile := baseDirectory.value / "src" /"resources",
    resourceDirectory in Test := baseDirectory.value / "src"/ "resources_test",
    resourceDirectory in IntegrationTest := baseDirectory.value / "src" /"resources_test",
    unmanagedSourceDirectories in Compile += baseDirectory.value / "src" / "generated",
    unmanagedResourceDirectories in Compile += baseDirectory.value / "src" / "resources_generated"
  )
}
