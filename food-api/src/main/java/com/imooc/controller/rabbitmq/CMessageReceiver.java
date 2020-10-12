package com.imooc.controller.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanout.C")
public class CMessageReceiver {

    @RabbitHandler
    public void process(String message) {
        System.out.println("CMessageReceiver : " + message);
    }

}