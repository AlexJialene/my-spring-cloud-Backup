package com.keizyi.ribbon.controller;

import com.keizyi.ribbon.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private IndexService indexService;

    @GetMapping("/hello")
    public String hello(String name){
        return indexService.hello(name);
    }
}
