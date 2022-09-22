package com.example.springbootproject.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controlleruc5 {
    @PutMapping("/twonames/{firstname}")
    public String putnames(@PathVariable String firstname, @RequestParam String lastname){
        return "Hello"+" "+firstname+""+lastname+" from Bridgelabz";
    }
}
