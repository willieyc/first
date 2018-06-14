package com.yin.boot.Service.jms;


import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootJmsApplicationTests {
    @Autowired
    private Producer producer;
    @Autowired
    private Publisher publisher;

//    @Bean
//    JmsListenerContainerFactory<?> myJmsContainerFactory(ConnectionFactory connectionFactory){
//        SimpleJmsListenerContainerFactory factory = new SimpleJmsListenerContainerFactory();
//        factory.setConnectionFactory(connectionFactory);
//        factory.setPubSubDomain(true);
//        return factory;
//    }

//    @Test
////    public void contextLoads() throws InterruptedException{
////        String destinationName = "mytest.queue";
////
////        for(int i=0;i<10;i++){
////            producer.sendMessage(destinationName,"test"+i);
////        }
////    }

    @Test
    public void test() {
        String destinationName = "mytest.topic";

        for (int i = 0; i < 10; i++) {
            publisher.publish(destinationName, "test" + i);
        }
    }
}
