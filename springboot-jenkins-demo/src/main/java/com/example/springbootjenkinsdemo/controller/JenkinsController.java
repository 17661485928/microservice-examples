package com.example.springbootjenkinsdemo.controller;

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

    @RequestMapping(value = "/")
    public String getJenkinsTest(){
        return "测试jenkins自动化部署项目";
    }
}
