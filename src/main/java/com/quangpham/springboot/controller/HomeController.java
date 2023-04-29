package com.quangpham.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "Hello home";
    }

    @GetMapping("/workout")
    public String workout(){
        return "Run a hard 5km!";
    }
}
