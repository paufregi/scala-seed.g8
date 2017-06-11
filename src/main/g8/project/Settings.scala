import sbt.Keys._
import sbt._

object Settings {

  private object Version {
    lazy val SCALA = "2.12.2"
  }

  lazy val general = Seq(
    scalaVersion := Version.SCALA,
    organization := "net.pellis",

    resolvers ++= Seq(
      Resolver.defaultLocal,
      Resolver.mavenLocal
    )
  )
}
