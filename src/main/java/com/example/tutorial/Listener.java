package com.example.tutorial;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @RabbitListener(queues = "TEST_QUEUE_1")
    public void receive(Data data) {
        System.out.println(data.getUsername() + " " + data.getPassword());
    }

}
