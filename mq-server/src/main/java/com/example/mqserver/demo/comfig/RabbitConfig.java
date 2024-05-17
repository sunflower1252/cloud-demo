package com.example.mqserver.demo.comfig;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author YG
 */
@Configuration
public class RabbitConfig {

    private static final String QUEUE_NAME = "testQueue";

    @Bean
    public RabbitAdmin rabbitAdmin(ConnectionFactory connectionFactory) {
        return new RabbitAdmin(connectionFactory);
    }

    @Bean
    public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(jsonMessageConverter());
        return rabbitTemplate;
    }

    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    // 声明队列
    @Bean
    public Queue basicQueue() {
        return new Queue(QUEUE_NAME, true, false, false);
    }

    // 声明交换机（这里假设使用默认的 Direct 交换机）
    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange("");
    }

    // 绑定队列到交换机
    @Bean
    public Binding binding(Queue basicQueue, DirectExchange directExchange) {
        return BindingBuilder.bind(basicQueue).to(directExchange).with(QUEUE_NAME);
    }
}

