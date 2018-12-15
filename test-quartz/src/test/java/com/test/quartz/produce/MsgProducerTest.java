package com.test.quartz.produce;

import com.test.quartz.TestQuartzApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * @author wangwenhao@rtmap.com
 * @project test-a
 * @package com.test.quartz.produce
 * @date 2018/12/14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {TestQuartzApplication.class,MsgProducerTest.class})
public class MsgProducerTest {

    @Autowired
    private MsgProducer msgProducer;
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void sendMsg() {
//        RabbitTemplate rabbitTemplate = new RabbitTemplate();
//        MsgProducer pro = new MsgProducer(rabbitTemplate);
//        pro.sendMsg("cc");
        msgProducer.sendMsg("cc");

//        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("id", "1");
//        map.put("name", "pig");
//        //根据key发送到对应的队列
//        rabbitTemplate.convertAndSend("que_pig_key", map);
    }

    @Test
    public void confirm() {
    }

    @Test
    public void sendAll() {
    }
}