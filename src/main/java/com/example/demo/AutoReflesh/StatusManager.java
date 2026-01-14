package com.example.demo.AutoReflesh;

import java.util.Random;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class StatusManager {

    public static int[] status = new int[30];

    @Scheduled(fixedRate = 2000)
    public void updateStatus() {
        
        Random random = new Random();

        status[random.nextInt(30)] = 1;
        status[random.nextInt(30)] = 0;
        //TODO : 나중에 진짜 정기적으로 업데이트 해서 출력하고 싶은 상태값을 가져오도록 변경 필요
    }

    public int[] GetStatus() {
        return status;
    }

    public String PostStatus(int num) {
        if(num >= 0 && num < status.length) {
            if(status[num] != 1) {
                status[num] = num;
                return "Successed";
            }
        }
        return "Failed";
    }
}