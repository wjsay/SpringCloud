package com.orange.service;

import com.orange.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

/**
 * @author yu
 * @date 2021/3/3 12:28 下午
 **/
@Component
public class HelloServiceFallback implements RefactorHelloService {

    @RequestMapping("/hello")
    @Override
    public String hello() {
        return "error";
    }

    @Override
    @GetMapping("/hello1")
    public String hello(@RequestParam("name") String name) {
        return "error";
    }

    @Override
    @GetMapping("/hello2")
    public User hello(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        return new User("未知", 0);
    }

    @Override
    @PostMapping("/hello3")
    public String hello(@RequestBody User user) {
        return "error";
    }
}
