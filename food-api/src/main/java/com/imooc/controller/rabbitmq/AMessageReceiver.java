package com.imooc.controller.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * https://www.cnblogs.com/flgb/p/12831426.html
 * @description: https://www.cnblogs.com/flgb/p/12831426.html
 * @param:
 * @return:
 * @author: jianjun
 * @date: 2020/10/12 16:44
 */
@Component
@RabbitListener(queues = "fanout.A")
public class AMessageReceiver {

    @RabbitHandler
    public void process(String message) {
        System.out.println("AMessageReceiver : " + message);
    }

}