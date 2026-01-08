package com.example.demo.SimpleSpring;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;

@Component
@Lazy
@Log4j2
public class LazyTest {
    
    public int a;
    @PostConstruct
    void ConstructTime() {
       log.info("hello"); 
    }
}
