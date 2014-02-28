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
      
      
    
    
    
    case _ => log.info("Não é uma pessoa")

  }

  def retornaPessoa(pessoa: Pessoa): String = {
    	"Método do ator pessoa"
  }

}