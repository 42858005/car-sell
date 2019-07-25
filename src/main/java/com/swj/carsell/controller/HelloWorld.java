package com.swj.carsell.controller;

import com.swj.carsell.annotation.UserLoginToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld {

    @GetMapping("/vlogin")
    public String vlogin() {
        return "viplogin";
    }

    @GetMapping("/vipIndex")
    @UserLoginToken
    public String vipIndex() {
        return "vipindex";
    }
}
