package com.imooc.controller.rabbitmq;

import com.imooc.controller.rabbitmq.model.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    //发送者
    public void send(User user) {
        System.out.println("UserSender: " + user.toString());
        this.rabbitTemplate.convertAndSend("user", user);
    }
}