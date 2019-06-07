package com.keizyi.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/hello")
    public String hello(String name){

        //throw new RuntimeException();
        System.out.println("hello");
        return "hello,"+name;


    }



}
