package com.raessc.demo02.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloWorld {

    @GetMapping("/hello")
    public String Hello(@RequestParam String param) {
        return new String("Welcome " + param);
    }
    


}
