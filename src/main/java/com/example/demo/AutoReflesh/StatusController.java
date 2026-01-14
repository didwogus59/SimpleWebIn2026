package com.example.demo.AutoReflesh;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/status")
public class StatusController {
    
    private final StatusManager manager;

    public StatusController(StatusManager manager) {
        this.manager = manager;
    }
    
    @GetMapping
    public int[] GetStatus() {
        return manager.GetStatus();
    }
    
    @PostMapping
    public String PostStatus(@RequestBody int entity) {
        return manager.PostStatus(entity);
    }
    
}
