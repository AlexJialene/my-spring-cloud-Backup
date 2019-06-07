package com.keizyi.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "EUREKA-CLI" , fallback = IndexServiceFallbak.class)
public interface IndexService {

    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    String sayHello(@RequestParam("name") String name);
}
