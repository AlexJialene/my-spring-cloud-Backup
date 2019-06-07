package com.keizyi.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${test}")
    String test;

    @GetMapping("/hello")
    public String hello(){
        return "hello,test:"+this.test;
    }
}
