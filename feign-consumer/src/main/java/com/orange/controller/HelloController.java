package com.orange.controller;

import com.orange.entity.User;
import com.orange.service.HelloService;
import com.orange.service.RefactorHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yu
 * @date 2021/3/2 1:30 下午
 **/
@RestController
public class HelloController {
    private RefactorHelloService refactorHelloService;

    @Autowired
    public void setRefactorHelloService(RefactorHelloService refactorHelloService) {
        this.refactorHelloService = refactorHelloService;
    }

    @GetMapping("/feign-consumer")
    public String helloConsumer() {
        return refactorHelloService.hello();
    }

    @GetMapping("/feign-consumer2")
    public String helloConsumer2() {
        StringBuilder sb = new StringBuilder();
        return sb.append(refactorHelloService.hello()).append("\n")
                .append(refactorHelloService.hello("Apple")).append("\n")
                .append(refactorHelloService.hello("Banana", 7)).append("\n")
                .append(new User("orange", 8)).append("\n").toString();
    }
}
