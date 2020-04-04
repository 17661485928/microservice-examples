package com.example.springbootjenkinsdemo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "springboot-producer-demo")
public interface ProducerDemoService {

    @RequestMapping(value = "/getProducerDemoData")
    public String getProducerDemoData(@RequestBody String requestJson);
}
