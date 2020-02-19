package com.example.kafka.springbootkafkaproducer.resource;

import com.example.kafka.springbootkafkaproducer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("kafka")
public class UserResource {

    @Autowired
    private KafkaTemplate<String,User> kafkaTemplate;
    private static final String TOPIC = "Kafka_Example";
    @GetMapping("/publish/{message}")
    public String post(@PathVariable("message") final String name){
        Logger.getLogger(name);
        kafkaTemplate.send(TOPIC,new User(name,"Manager",  1000L));
        return "Published succesfully";
    }
}
