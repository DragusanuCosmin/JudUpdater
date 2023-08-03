package com.example.judupdater.Listener;

import com.example.judupdater.Entities.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageListener {
    @KafkaListener(topics = "dosare_noi",containerFactory = "kafkaListenerContainerFactory")
    public void receiveMessage(Message message) {
        System.out.println(message.toString());
    }
}
