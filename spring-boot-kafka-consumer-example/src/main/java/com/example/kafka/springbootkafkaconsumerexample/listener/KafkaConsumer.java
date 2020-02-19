package com.example.kafka.springbootkafkaconsumerexample.listener;

import com.example.kafka.springbootkafkaconsumerexample.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    //handles directlt-topic name is provided based on business requiremtn
    @KafkaListener(topics = "Kafka_Example", groupId = "group_id")
    public void consumer(String message){
        System.out.println("consumed message" + message);
    }
    @KafkaListener(topics = "Kafka_Example_json",groupId = "group_json",containerFactory = "userKafkaListenerFactory")
    public void consumerJSON(User user){
        System.out.println("Consumed Json message" + user);
    }
}
