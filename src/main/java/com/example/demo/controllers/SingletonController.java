package com.example.demo.controllers;

import com.example.demo.Singleton;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SingletonController {

    @GetMapping("/singleton/info")
    public Map<String, Object> getSingletonInfo() {
        // Get the singleton instance
        Singleton instance = Singleton.getInstance();

        // Return information about the singleton
        Map<String, Object> info = new HashMap<>();
        info.put("instanceId", System.identityHashCode(instance));
        info.put("data", instance.getData());

        return info;
    }

    @PostMapping("/singleton/data")
    public Map<String, Object> updateSingletonData(@RequestParam String data) {
        // Get the singleton instance
        Singleton instance = Singleton.getInstance();

        // Update the data
        instance.setData(data);

        // Return updated information
        Map<String, Object> response = new HashMap<>();
        response.put("status", "updated");
        response.put("instanceId", System.identityHashCode(instance));
        response.put("data", instance.getData());

        return response;
    }
}
