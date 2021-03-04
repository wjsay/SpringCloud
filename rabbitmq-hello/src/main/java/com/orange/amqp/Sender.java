package com.orange.amqp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author yu
 * @date 2021/3/4 2:47 下午
 **/
@Component
public class Sender {

    private AmqpTemplate amqpTemplate;
    private Logger logger = LoggerFactory.getLogger(Sender.class);

    @Autowired
    public void setAmqpTemplate(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    public void send() {
        String content = "hello " + new Date();
        logger.info(content);
        amqpTemplate.convertAndSend("hello", content);
    }
}
