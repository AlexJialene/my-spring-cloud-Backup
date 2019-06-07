package com.keizyi.feign.controller;

import com.keizyi.feign.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private IndexService indexService;

    @GetMapping("/hello")
    public String hello(String name){
        return this.indexService.sayHello(name);
    }
}
