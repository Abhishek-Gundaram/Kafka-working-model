package com.abhishek.kafka.service;

import com.abhishek.kafka.model.Course;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    private volatile String message = "No message received yet";

    @KafkaListener(topics = "abhishek", groupId = "abhishek-group-debug-2")
    public void consume(Course course) {
        System.out.println("Listener fired");
        System.out.println("Received course: " + course);
        message = course.toString() + " got the message from kafka";
    }

    public String getMessage() {
        return message;
    }
}