enablePlugins(JavaAppPackaging)

name := "akka-cluster-downing-example"

version := "0.1"

scalaVersion := "2.12.4"

resolvers += Resolver.jcenterRepo

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-cluster" % "2.5.7",
  "com.lightbend.akka" %% "akka-management-cluster-http" % "0.6",
  "pl.immutables" %% "akka-reasonable-downing" % "0.0.4"
)
        