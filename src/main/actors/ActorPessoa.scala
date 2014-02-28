package main.actors

import akka.actor.Actor
import main.messages.Pessoa
import main.messages.Metric
import akka.event.Logging

class ActorPessoa extends Actor {
val log = Logging(context.system, this)
  def receive = {
    case message: String =>
      println("Ator pessoa")
      
      
    
    
    
    case _ => log.info("N�o � uma pessoa")

  }

  def retornaPessoa(pessoa: Pessoa): String = {
    	"M�todo do ator pessoa"
  }

}