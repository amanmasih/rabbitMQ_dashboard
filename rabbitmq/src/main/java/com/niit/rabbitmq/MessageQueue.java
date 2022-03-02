package com.niit.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("hello-world")
public class MessageQueue {
    //import Queue from amqp.core.queue
    @Bean
    public Queue hello(){return new Queue("hello");}

    //create a bean for reciever
    @Profile("reciever")
    @Bean
    public MessageReciever reciever(){return new MessageReciever();}

    @Profile("sender")
    @Bean
    public MessageSender sender(){return new MessageSender();}
}//end of class
