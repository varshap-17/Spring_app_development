package com.example.springbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controlleruc2 {
    @GetMapping("/reterive")
    public String getFirstName(@RequestParam String name){
        return "Hello"+" "+name+" from Bridgelabz";
    }
}
