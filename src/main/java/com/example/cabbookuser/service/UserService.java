package com.example.cabbookuser.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @KafkaListener(topics = "cab-location",groupId = "user-group")
    public void viewLocation(String location)
    {
        System.out.println("Location in consumer : "+location);

    }
}
