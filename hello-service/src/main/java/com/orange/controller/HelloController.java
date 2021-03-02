package com.orange.controller;

import com.orange.entity.User;
import com.orange.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**Ø
 * @author yu
 * @date 2021/2/24 8:30 下午
 **/
@RestController
public class HelloController implements HelloService {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @Override
    @GetMapping("/hello1")
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @Override
    @GetMapping("/hello2")
    public User hello(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        return new User(name, age);
    }

    @Override
    @PostMapping("/hello3")
    public String hello(@RequestBody User user) {
        return "Hello " + user.getName() + ", " + user.getAge();
    }

}
