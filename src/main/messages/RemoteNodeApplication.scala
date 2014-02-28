package main.messages

import akka.kernel.Bootable
import akka.actor.ActorSystem
import com.typesafe.config.ConfigFactory
import akka.actor.Props

class RemoteNodeApplication extends Bootable {

  val system = ActorSystem("RemoteNodeApp", ConfigFactory.load().getConfig("RemoteSys"))
  def startup = {
    system.actorOf(Props[RemoteActor], name = "remoteActor")
  }
  def shutdown = {
    system.shutdown()
  }
}