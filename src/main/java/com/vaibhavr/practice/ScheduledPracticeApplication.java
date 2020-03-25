package com.vaibhavr.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ScheduledPracticeApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ScheduledPracticeApplication.class);
    }
    
}
