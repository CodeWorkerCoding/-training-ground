package com.nchu.amqp.listener;

import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.stereotype.Component;

/**
 * @author fujianjian
 * @project self-learn
 * @date 2018/7/10 11:20
 */
@Slf4j
@Component
public class RabbitMQMessageListener implements ChannelAwareMessageListener {

    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
        byte[] body = message.getBody();
        try {
            String strMsg = new String(body, "UTF-8");
            log.info("the reveice message: {}", strMsg);
            channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);
        } catch (Exception e) {
            log.error("the reveice message error", e);
            channel.basicReject(message.getMessageProperties().getDeliveryTag(), true);
        }
    }
}
