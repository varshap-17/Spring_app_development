package com.example.springbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controlleruc1 {
    @GetMapping("/adds")
    public String getName(){
        return "Hello from bridgelabz";
    }
}
