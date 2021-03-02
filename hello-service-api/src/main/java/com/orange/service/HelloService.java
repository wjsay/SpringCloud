package com.orange.service;

import com.orange.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * @author yu
 * @date 2021/3/2 10:55 下午
 **/
public interface HelloService {
    @RequestMapping("/hello")
    String hello();

    @GetMapping("/hello1")
    String hello(@RequestParam("name") String name);

    @GetMapping("/hello2")
    User hello(@RequestParam("name") String name, @RequestParam("age") Integer age);

    @PostMapping("/hello3")
    String hello(@RequestBody User user);
}
