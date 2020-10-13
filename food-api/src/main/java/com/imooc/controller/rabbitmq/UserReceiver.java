package com.imooc.controller.rabbitmq;

import com.imooc.controller.rabbitmq.model.User;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(bindings = @QueueBinding(
        value=@Queue(value="quser",durable="false",autoDelete = "true"),
        exchange = @Exchange(value="euser",type = ExchangeTypes.TOPIC),
        key="r"
            )
       )
public class UserReceiver {

    @RabbitHandler
    public void process(User user) {
        System.out.println("UserReceiver : " + user);
    }

}