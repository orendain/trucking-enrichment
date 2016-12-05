name := "trucking-enrichment"

version := "0.1"

organization := "com.hortonworks.orendainx"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.hortonworks.orendainx" %% "trucking-shared" % "0.1",

  "com.github.tototoshi" %% "scala-csv" % "1.3.4",
  "com.typesafe" % "config" % "1.3.1",
  "com.github.pathikrit" %% "better-files" % "2.16.0"
)
