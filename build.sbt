import org.scalatra.sbt._

organization := "com.example"

name := "atmosphere-example"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.8"

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"

resolvers += "Akka Repo" at "http://repo.akka.io/repository"

libraryDependencies ++= Seq(
  "org.json4s"   %% "json4s-jackson" % "3.5.0",
  "org.scalatra" %% "scalatra" % "2.5.0",
  "org.scalatra" %% "scalatra-scalate" % "2.5.0",
  "org.scalatra" %% "scalatra-specs2" % "2.5.0" % "test",
  "org.scalatra" %% "scalatra-atmosphere" % "2.5.0",
  "org.eclipse.jetty" % "jetty-webapp" % "9.2.19.v20160908" % "provided",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
)

ScalatraPlugin.scalatraWithJRebel

enablePlugins(JettyPlugin)

