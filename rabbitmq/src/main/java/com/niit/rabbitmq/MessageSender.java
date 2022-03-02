package com.niit.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

public class MessageSender {
    @Autowired
    RabbitTemplate rabbitTemplate;	//this send the message in a binary format
    //provides each and every method and functionality to send/recieve the message

    @Autowired //import from amqp.core.queue
    Queue queue;

    @Scheduled(fixedDelay=1000,initialDelay=500)
    //for scheduling and if the hault happens schedule after a delay
    public void send (){
        String message = "Hello World";
        this.rabbitTemplate.convertAndSend(queue.getName(),message);
        //convert and send is converting the string into a binary format
        System.out.println("[x] sent -->  " +message );
    }//end of function
}
