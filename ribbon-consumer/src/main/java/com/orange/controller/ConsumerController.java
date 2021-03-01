package com.orange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yu
 * @date 2021/2/27 7:20 下午
 **/
@RestController
public class ConsumerController {
    /**
     * 来自ConsumerApplication中实例化的bean
     */
    private RestTemplate restTemplate;

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * 通过hello-service服务名找到服务提供者
     * @return
     */
    @GetMapping("/ribbon-consumer")
    public String helloConsumer() {
        return restTemplate.getForEntity("http://hello-service/hello", String.class).getBody();
    }
}
