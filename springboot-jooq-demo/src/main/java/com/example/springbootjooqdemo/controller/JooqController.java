package com.example.springbootjooqdemo.controller;

import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JooqController {

    @Autowired
    DSLContext dslContext;
    @Autowired
    Configuration configuration;
}
