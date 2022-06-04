package com.spring.carwash.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduledJobs {

    @Scheduled(cron = "0 21 22 * * ?")
    public void scheduledJob() {
        System.out.println("Job running at: " + new Date());
    }
}
