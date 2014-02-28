package main.actors

import akka.actor.Actor
import main.messages.Metric
import akka.event.Logging

class ActorMessage extends Actor {
val log = Logging(context.system, this)
 def receive = {
     case message : Metric =>
       println("Ator Metrica")
     case _ => log.info("Não é uma metrica")
     
   }
  
}