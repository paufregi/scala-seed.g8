package lab.acme.projectutils

import sbt.Keys._
import sbt._

object Settings {
  lazy val general = Seq(
    scalaVersion := "2.12.2",
    resolvers ++= Seq(
      Resolver.defaultLocal,
      Resolver.mavenLocal
    )
  )
}
