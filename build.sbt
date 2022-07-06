import Dependencies._

ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.janikdotzel.fortify-sca"
ThisBuild / organizationName := "fortify-sca"

lazy val root = (project in file("."))
  .settings(
    name := "fortify-sca",
    libraryDependencies += scalaTest % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.

addCompilerPlugin(
  "com.lightbend" % "scala-fortify" % "1.0.22"
    cross CrossVersion.patch)
scalacOptions += s"-P:fortify:build=fortify-sca"
scalacOptions += "-Ystop-before:jvm"
