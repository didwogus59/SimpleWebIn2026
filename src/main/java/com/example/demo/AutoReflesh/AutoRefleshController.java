package com.example.demo.AutoReflesh;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/now")
public class AutoRefleshController {
    
    private final StatusManager manager;

    public AutoRefleshController(StatusManager manager) {
        this.manager = manager;
    }
    @GetMapping
    public int GetRefleshedStatus() {
        return manager.GetStatus();
    }
    
}
