package com.orange.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author yu
 * @date 2021/2/24 8:30 下午
 **/
@RestController
public class HelloController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

}
