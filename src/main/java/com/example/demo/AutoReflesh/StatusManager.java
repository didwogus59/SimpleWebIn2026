package com.example.demo.AutoReflesh;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class StatusManager {

    public static int status = 0;

    @Scheduled(fixedRate = 1000)
    public void updateStatus() {
        status++;

        if (status >= 20) {
            status = 0;
        }
    }

    public int GetStatus() {
        return status;
    }
}