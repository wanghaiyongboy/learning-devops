package com.why.devops.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/demo")
public class TestController {


    @GetMapping("/hello/{world}")
    public String test(@PathVariable String world) {
        return "hello "+ world;
    }
}
