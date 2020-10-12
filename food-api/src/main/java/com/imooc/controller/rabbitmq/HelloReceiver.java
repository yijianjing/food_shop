package com.imooc.controller.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "hello")
public class HelloReceiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver11111111  : " + hello);
    }

    @RabbitHandler
    public void process(Integer i) {
        System.out.println("Receiver*111111  : " + i);
    }

}