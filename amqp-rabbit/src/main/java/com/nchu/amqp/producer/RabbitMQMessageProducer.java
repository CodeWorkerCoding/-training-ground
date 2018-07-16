package com.nchu.amqp.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/7/10 14:32
 */
@Component
public class RabbitMQMessageProducer {

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void producerMessage(String routeKey, Object object) {
        this.amqpTemplate.convertAndSend(routeKey, object);
    }

}
