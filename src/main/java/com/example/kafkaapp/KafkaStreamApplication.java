package com.example.kafkaapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KafkaStreamApplication {

	
	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(KafkaStreamApplication.class, args);
	}

}
