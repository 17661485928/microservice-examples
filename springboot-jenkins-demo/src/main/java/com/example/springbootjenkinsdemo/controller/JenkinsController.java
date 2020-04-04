package com.example.springbootjenkinsdemo.controller;

import com.example.springbootjenkinsdemo.service.ProducerDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName JenkinsController
 * @Description TODO
 * @Author qht
 * @Date 2020/4/3 15:31
 * @Version 1.0
 */
@RestController
public class JenkinsController {

    @Autowired
    private ProducerDemoService producerDemoService;

    @RequestMapping(value = "/")
    public String getJenkinsTest(@RequestBody String requestJson){
        String producerDemoData = producerDemoService.getProducerDemoData(requestJson);
        return producerDemoData;
    }
}
