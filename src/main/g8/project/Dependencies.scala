import sbt._

object Dependencies {

  private object Version{
    lazy val config = "1.3.3"
    lazy val scalaLogging = "3.9.0"
    lazy val scalatest = "3.0.5"
  }

  val typesafeConfig = "com.typesafe" % "config" % Version.config
  val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % Version.scalaLogging
  val scalatest = "org.scalatest" %% "scalatest" % Version.scalatest
}
