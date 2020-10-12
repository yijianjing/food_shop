package com.imooc.config.rabbit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;

/**
 * @author jianjun
 * @version 1.0
 * @date 2020/10/12
 */
@Configuration
public class RabbitConfig {
    @Bean
    public Queue Queue() {
        return new Queue("hello");
    }

    @Bean
    public Queue UserQueue() {
        return new Queue("user");
    }

}
