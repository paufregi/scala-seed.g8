import Dependencies._

lazy val root = (project in file("."))
  .configs(IntegrationTest)
  .settings(Defaults.itSettings : _*)
  .settings(Settings.general: _*)
  .settings(
    name := "$name$",
    version := "0.1.0-SNAPSHOT"
  )
  .settings(libraryDependencies ++= utils ++ tests)
