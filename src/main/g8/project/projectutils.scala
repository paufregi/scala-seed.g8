package lab.acme

import sbt._
import sbt.Keys._
import sbtassembly.AssemblyKeys._

package object projectutils {

  implicit class ProjectUtils(inner: Project) {
    def basic(path: String, projectName: String, org: String): Project =
      inner
        .in(file(path))
        .configs(IntegrationTest)
        .settings(Defaults.itSettings: _*)
        .settings(Settings.general: _*)
        .settings(DirectoryLayoutSettings.defaults)
        .settings(
          name := projectName,
          organization := org
        )

    def version(v: String): Project =
      inner
        .settings(
          version := v
        )

    def withAssembly(folder: String, main: String): Project =
      inner
        .settings(
          test in assembly := {},
          target in assembly := file(folder),
          assemblyJarName in assembly := s"${name.value}.jar",
          mainClass in assembly := Some(main)
        )

    def withLibraries(libs: ModuleID*): Project =
      inner.settings(libraryDependencies ++= libs)

    def withTestLibraries(libs: ModuleID*): Project =
      inner.settings(libraryDependencies ++= libs.map(_ % "test,it"))
  }
}
