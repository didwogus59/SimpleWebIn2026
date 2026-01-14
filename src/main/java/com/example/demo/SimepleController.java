package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;


@RestController
@RequestMapping("/")
@Log4j2
public class SimepleController {
    
    @GetMapping
    public String GetSimple() {
        String test = null;

        return Integer.toString(test.length());
    }

    @PostMapping
    public String PostSimple(@RequestBody String entity) {
        return entity + " from post";
    }
    
}
