package com.quangpham.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${app.messages}")
    private String message;
    @GetMapping("/")
    public String home(){
        return message;
    }

    @GetMapping("/workout")
    public String workout(){
        return "Run a hard 5km!";
    }
}
