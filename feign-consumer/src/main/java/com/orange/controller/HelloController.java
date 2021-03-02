package com.orange.controller;

import com.orange.entity.User;
import com.orange.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yu
 * @date 2021/3/2 1:30 下午
 **/
@RestController
public class HelloController {
    private HelloService helloService;

    @Autowired
    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/feign-consumer")
    public String helloConsumer() {
        return helloService.hello();
    }

    @GetMapping("/feigin-consumer2")
    public String helloConsumer2() {
        StringBuilder sb = new StringBuilder();
        return sb.append(helloService.hello()).append("\n")
                .append(helloService.hello("Apple")).append("\n")
                .append(helloService.hello("Banana", 7)).append("\n")
                .append(new User("orange", 8)).append("\n").toString();
    }
}
