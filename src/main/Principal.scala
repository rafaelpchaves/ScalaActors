package main

import akka.actor.ActorSystem
import akka.actor.Props
import main.actors.ActorPessoa
import main.messages.Pessoa
import main.messages.Metric
import main.actors.ActorMessage
import main.messages.RemoteNodeApplication
import main.messages.RemoteNodeApplication
import akka.actor.Actor
import com.typesafe.config.ConfigFactory
import akka.kernel.Bootable

object Principal {

  def main(args: Array[String]) {
    val system = ActorSystem("RemoteServer", ConfigFactory.load().getConfig("RemoteSys"))

    val actorPessoa = system.actorOf(Props[ActorPessoa], name = "RemoteActor")
    val actorMessage = system.actorOf(Props[ActorMessage], name = "actorMessage")

     var p = new Pessoa("teste")
    //  var metrica = new Metric(10,10)

    // actorPessoa ! (p)

  }

}