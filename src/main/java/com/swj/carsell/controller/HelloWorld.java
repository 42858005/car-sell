package com.swj.carsell.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @PostMapping("/hello")
    public String hello() {
        return "hello";
    }
 //aaa
}
