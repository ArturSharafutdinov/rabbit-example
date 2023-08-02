package com.example.tutorial;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    @Autowired
    private RabbitTemplate template;

    public void send() {
        Data data = new Data();
        data.setUsername("user_1");
        data.setPassword("password_1");
        template.convertAndSend("TEST_QUEUE_2", data);
        System.out.println("SEND MESSAGE TO QUEUE_2");
    }


}
