import sbt._

object Dependencies {

  private object Version{
    lazy val config = "1.3.1"
    lazy val scalaLogging = "3.5.0"
    lazy val scalatest = "3.0.1"
  }

  private val config = "com.typesafe" % "config" % Version.config
  private val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % Version.scalaLogging
  private val scalatest = "org.scalatest" %% "scalatest" % Version.scalatest

  lazy val utils = Seq[ModuleID](config, scalaLogging)
  lazy val tests = Seq[ModuleID](scalatest) map (_ % "test,it")
}
