package com.example.springbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlleruc3 {
    @GetMapping("/input/{firstName}")
    public String getInput(@PathVariable String firstName){
        return "Hello"+" "+firstName+" from Bridgelabz";
    }
}
