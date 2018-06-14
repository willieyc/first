package com.yin.boot.Service.jms;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;

@Service("Producer")
public class Producer {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    // 发送消息，destination是发送到的队列，message是待发送的消息
    public void sendMessage(String destinationName, String message) {
        Destination destination = new ActiveMQQueue(destinationName);
        jmsMessagingTemplate.convertAndSend(destination, message);
        System.out.println(">>>>>>>>producer发送queue消息  队列：" + destination + "消息：" + message + "<<<<<<<<");
    }

    @JmsListener(destination = "out.queue")
    public void consumerMessage(String text) {
        System.out.println("producer从out.queue队列收到的回复消息为：" + text);
    }
}
