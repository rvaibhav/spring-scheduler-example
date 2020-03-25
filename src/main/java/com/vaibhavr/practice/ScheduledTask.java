package com.vaibhavr.practice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduledTask {
    
    private static final Logger log = LoggerFactory.getLogger(ScheduledTask.class);
    
    private static final DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    
    @Scheduled(fixedRate = 3000)
    public void doTask() {
        log.info("The time is now {}", dateFormat.format(new Date()));
    }
}
