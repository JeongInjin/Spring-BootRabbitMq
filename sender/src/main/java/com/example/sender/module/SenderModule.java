package com.example.sender.module;

import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.time.LocalDateTime;

@Configuration
@AllArgsConstructor
public class SenderModule {

    final RabbitTemplate rabbitTemplate;

    @Scheduled(fixedRate = 1000)
    public void Sender1() {

        LocalDateTime nowDateTime = LocalDateTime.now();
        String time = nowDateTime.toString();

        System.out.println(" sender : " + time);
        rabbitTemplate.convertAndSend("time", "time-first", time);
    }
}
