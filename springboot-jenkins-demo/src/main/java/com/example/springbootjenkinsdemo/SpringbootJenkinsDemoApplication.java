package com.example.springbootjenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 测试jenkins自动化部署项目
 */
@SpringBootApplication
@EnableFeignClients
public class SpringbootJenkinsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJenkinsDemoApplication.class, args);
    }

}
