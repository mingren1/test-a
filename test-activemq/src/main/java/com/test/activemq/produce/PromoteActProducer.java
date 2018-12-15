package com.test.activemq.produce;

import com.test.activemq.util.ActiveMQUtil;
import org.apache.activemq.command.ActiveMQMapMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.*;

@Component
@EnableScheduling
public class PromoteActProducer {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

//    private JmsMessagingTemplate jmsMessagingTemplate = new JmsMessagingTemplate();

//    @Autowired
//    private Queue queue;

//    @Scheduled(fixedDelay = 2000)    // 每2s执行1次
//    public void send() {
//        this.jmsMessagingTemplate.convertAndSend(this.queue, "hello,activeMQ");
//    }

    @Autowired
    private ActiveMQUtil activeMQUtil;

    public void sendPaymentResult( String result) {
        // 创建工厂
        Connection connection = activeMQUtil.getConnection();
        try {
            connection.start();
            // 创建session
            Session session = connection.createSession(true, Session.SESSION_TRANSACTED);
            // 创建队列，提供者
            Queue payment_result_queue = session.createQueue("PAYMENT_RESULT_QUEUE");

            MessageProducer producer = session.createProducer(payment_result_queue);

            // 设置发送的消息 orderId,result
            ActiveMQMapMessage mapMessage = new ActiveMQMapMessage();
            mapMessage.setString("orderId","11111");
            mapMessage.setString("result",result);

            producer.send(mapMessage);
            // 必须提交
            session.commit();

            producer.close();
            session.close();
            connection.close();

        } catch (JMSException e) {
            e.printStackTrace();
        }


    }
}
