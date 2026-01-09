package com.example.demo.SimpleSpring.VirtualThread;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlockingController {

    private static final Logger log = LoggerFactory.getLogger(BlockingController.class);

    @GetMapping("/test-blocking")
    public String heavyWork() throws InterruptedException {
        // 1. 현재 스레드 정보 로깅 (VirtualThread인지 확인하기 위함)
        // 예: VirtualThread[#25]/runnable@ForkJoinPool-1-worker-1
        String threadInfo = Thread.currentThread().toString();
        log.info("요청 처리 시작: {}", threadInfo);

        // 2. 1초간 Blocking 시뮬레이션 (DB 조회나 외부 API 호출 가정)
        // 기존 스레드 모델에서는 여기서 스레드가 낭비되지만, Virtual Thread는 여기서 언마운트(Unmount)됩니다.
        Thread.sleep(10000); 

        return "Processed by: " + threadInfo;
    }
}