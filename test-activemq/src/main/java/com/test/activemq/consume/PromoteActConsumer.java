package com.test.activemq.consume;

import com.test.activemq.util.ActiveMQUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.JMSException;
import javax.jms.MapMessage;

public class PromoteActConsumer {

    /**
     * 客户端消费
     *
     * @param consumer
     */
    @Autowired
    ActiveMQUtil activeMQUtil;


    //    @JmsListener(destination = "PAYMENT_RESULT_QUEUE",containerFactory = "jmsQueueListener")
//    public void receiveQueue(String consumer) {
//        System.out.println(consumer+"消息已经消费了");
//    }
    @JmsListener(destination = "promoteAct",containerFactory = "jmsQueueListener")
    public void receiveQueue(MapMessage mapMessage) {
        try {
            String result = mapMessage.getString("result");
            String orderId = mapMessage.getString("orderId");

            System.out.println( "消息已经消费了::"+result+"------"+orderId);
        } catch (JMSException e) {
            e.printStackTrace();
        }

//        System.out.println("hahahahhahahahahahah");
    }

}
