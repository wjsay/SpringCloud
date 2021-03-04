package com.orange.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yu
 * @date 2021/3/4 8:46 下午
 **/
@RestController
@RefreshScope
public class TestController {
    @Value("${from}")
    private String from;

    @GetMapping("/from")
    public String from() {
        return this.from;
    }
}
