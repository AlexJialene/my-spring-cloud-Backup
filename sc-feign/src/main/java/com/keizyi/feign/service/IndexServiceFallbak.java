package com.keizyi.feign.service;

import org.springframework.stereotype.Component;

@Component
public class IndexServiceFallbak implements IndexService {
    @Override
    public String sayHello(String name) {
        System.out.println("==================");
        return "sorry:" + name;
    }
}
