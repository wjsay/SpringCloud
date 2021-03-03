package com.orange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yu
 * @date 2021/3/3 3:53 下午
 **/
@RefreshScope
@RestController
public class TestController {
    @Value("${from}")
    private String from;

    private Environment env;

    @Autowired
    public void setEnv(Environment env) {
        this.env = env;
    }

    @GetMapping("/from")
    public String from() {
        return this.from;
    }

    @GetMapping("/from2")
    public String from2() {
        return env.getProperty("from", "undefined");
    }
}
