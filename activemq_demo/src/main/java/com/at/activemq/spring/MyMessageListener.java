package com.at.activemq.spring;

import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/***
 * @description 配置监听
 * @author YangCheng
 * @date 2020/9/1 0001 16:14
 */
@Component
public class MyMessageListener  implements MessageListener{

    @Override
    public void onMessage(Message message) {
        if (null != message && message instanceof TextMessage){
            TextMessage textMessage = (TextMessage) message;
            try {
                System.out.println( textMessage.getText());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
