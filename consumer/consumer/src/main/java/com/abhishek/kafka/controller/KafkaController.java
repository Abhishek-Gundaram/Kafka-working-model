package com.abhishek.kafka.controller;
import com.abhishek.kafka.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    @Autowired
    private KafkaService kafkaService;

    @GetMapping("/get-course")
    public ResponseEntity<String> getCourse(){
        String response = kafkaService.getMessage();
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }
}
