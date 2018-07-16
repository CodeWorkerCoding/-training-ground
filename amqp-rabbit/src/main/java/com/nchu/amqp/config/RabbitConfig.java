package com.nchu.amqp.config;

import com.nchu.amqp.listener.RabbitMQMessageListener;
import lombok.Data;
import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.RabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/7/9 18:10
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "com.nchu.rabbit")
public class RabbitConfig {


    private String queueName;

    private String exchangeName;

    @Bean
    public Queue queue() {
        return new Queue(queueName);
    }

    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange(exchangeName, true, false);
    }

    @Bean
    public Binding binding(Queue queue, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(queue).to(fanoutExchange);
    }

    @Bean
    public SimpleMessageListenerContainer simpleMessageListenerContainer(
            ConnectionFactory connectionFactory,
            RabbitMQMessageListener rabbitMQMessageListener,
            Queue queue) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
        container.setMessageListener(rabbitMQMessageListener);
        container.setQueues(queue);
        container.setConnectionFactory(connectionFactory);
        container.setConcurrentConsumers(10);
        container.setMaxConcurrentConsumers(20);
        container.setAcknowledgeMode(AcknowledgeMode.MANUAL);
        return container;
    }

}
