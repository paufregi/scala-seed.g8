package lab.acme.projectutils

import sbt._

object Dependencies {

  private object Version{
    lazy val typesafeConfig = "1.3.3"
    lazy val scalaLogging = "3.9.0"
    lazy val scalatest = "3.0.5"
  }

  lazy val typesafeConfig = "com.typesafe" % "config" % Version.typesafeConfig
  lazy val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % Version.scalaLogging
  lazy val scalatest = "org.scalatest" %% "scalatest" % Version.scalatest
}
