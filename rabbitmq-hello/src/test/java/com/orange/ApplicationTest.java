package com.orange;

import com.orange.amqp.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author yu
 * @date 2021/3/4 2:55 下午
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTest {
    private Sender sender;

    @Autowired
    public void setSender(Sender sender) {
        this.sender = sender;
    }

    @Test
    public void hello() throws Exception {
        sender.send();
    }
}
