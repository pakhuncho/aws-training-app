package com.example.aws_training_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String requestMethodName() {
        return "Hello!!";
    }
    
}
