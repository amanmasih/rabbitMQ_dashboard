package com.niit.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "hello")//this marks a method to be target of rabbit message listener on a specified queue
public class MessageReciever {
    @RabbitHandler   //this marks a method to be a target of a rabbit message listener within a class.
    public void recieve(String in){

        System.out.println("message recieved  -->  "+ in );

    }//end of the function
}
