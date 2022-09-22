package com.example.springbootproject.controller;

import com.example.springbootproject.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlleruc4 {
    @PostMapping("/save")
    public String postSave(@RequestBody User user){
        return "Hello"+" "+user.firstName+" "+user.lastName+" from Bridgelabz";
    }
}
