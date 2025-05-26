package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/{name}")
    public String testApi(@PathVariable String name){
        System.out.println("your name "+name);
        return "hello "+name;
    }
}
