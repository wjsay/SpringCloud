package com.orange.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author yu
 * @date 2021/3/2 10:20 上午
 **/
@Service
public class HelloService {
    /**
     * 来自ConsumerApplication中实例化的bean
     */
    private RestTemplate restTemplate;

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "helloFallback")
    public String helloService() {
        return restTemplate.getForEntity("http://hello-service/hello", String.class).getBody();
    }

    public String helloFallback() {
        return "error";
    }
}
