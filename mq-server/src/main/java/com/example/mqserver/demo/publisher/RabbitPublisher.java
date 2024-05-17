package com.example.mqserver.demo.publisher;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YG
 */
@RestController
@RequestMapping("/RabbitPublisher")
@Slf4j
public class RabbitPublisher {

    @Resource
    RabbitTemplate rabbitTemplate;

    @Resource
    RabbitAdmin rabbitAdmin;

    @GetMapping("/sendMessage")
    public void sendMessage(@RequestParam Integer toId, String message) {
        Integer userId = 1;
        String queue = userId + "." + toId;
        //消息加上时间戳
        message = System.currentTimeMillis() + "." + message;
        if (!rabbitAdmin.getBeanName().contains(queue)) {
            //创建消息队列并发送消息
            new Queue(queue, true, false, false);
        }
        rabbitTemplate.convertAndSend(queue, message);
    }
}
