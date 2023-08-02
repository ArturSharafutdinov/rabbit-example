package com.example.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private Producer producer;

    @GetMapping("/test")
    public void test() {
        producer.send();
    }

}
