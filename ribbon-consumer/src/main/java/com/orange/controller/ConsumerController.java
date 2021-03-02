package com.orange.controller;

import com.orange.service.HelloService;
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

    private HelloService helloService;

    @Autowired
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    /**
     * 通过hello-service服务名找到服务提供者
     * @return
     */
    @GetMapping("/ribbon-consumer")
    public String helloConsumer() {
        return helloService.helloService();
    }
}
