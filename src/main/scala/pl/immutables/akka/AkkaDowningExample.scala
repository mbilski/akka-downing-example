package pl.immutables.akka

import akka.actor.ActorSystem
import akka.cluster.Cluster
import akka.cluster.http.management.ClusterHttpManagement

object AkkaDowningExample extends App {
  val system = ActorSystem("ClusterSystem")
  val cluster = Cluster(system)
  ClusterHttpManagement(cluster).start()
}
