package com.orange.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author yu
 * @date 2021/3/2 11:45 下午
 **/
@FeignClient(value = "hello-service", fallback = HelloServiceFallback.class)
public interface RefactorHelloService extends HelloService {
}
