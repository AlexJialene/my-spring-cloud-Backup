package com.keizyi.ribbon.service.impl;

import com.keizyi.ribbon.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String hello(String name) {
        return this.restTemplate.getForObject("http://EUREKA-CLI/hello?name=" + name, String.class);
    }
}
