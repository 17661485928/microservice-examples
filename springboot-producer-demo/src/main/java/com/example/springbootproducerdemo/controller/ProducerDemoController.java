package com.example.springbootproducerdemo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ProducerDemoController
 * @Description TODO
 * @Author qht
 * @Date 2020/4/4 18:36
 * @Version 1.0
 */
@RestController
public class ProducerDemoController {

    @RequestMapping(value = "/getProducerDemoData")
    public String getProducerDemoData(@RequestBody String requestJson){
        return "测试SpringbootProducerDemoApplication服务提供接口返回>>>>>>>>"+requestJson;
    }
}
