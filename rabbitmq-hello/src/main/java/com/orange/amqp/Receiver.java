package com.orange.amqp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author yu
 * @date 2021/3/4 2:50 下午
 **/
@Component
@RabbitListener(queues = "hello")
public class Receiver {
    private Logger logger = LoggerFactory.getLogger(Receiver.class);

    @RabbitHandler
    public void process(String data) {
        logger.info(data);
    }
}
