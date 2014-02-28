package main.messages

import akka.actor.Actor

class RemoteActor extends Actor {
  def receive: Receive = {
    case message: String =>
      // Get reference to the message sender and reply back
      sender ! (message + " got something")
  }

}