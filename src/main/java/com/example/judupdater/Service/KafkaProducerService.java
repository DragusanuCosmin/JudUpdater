package com.example.judupdater.Service;

import com.example.judupdater.Entities.Message;
import lombok.extern.java.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Log
public class KafkaProducerService {

    private final Logger LOGGER = LoggerFactory.getLogger(KafkaProducerService.class);

    private final KafkaTemplate<String, Message> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, Message> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String topicName, String key, Message value) {
        var future = kafkaTemplate.send(topicName, key, value);

        future.whenComplete((sendResult, exception) -> {
            if (exception != null) {
                future.completeExceptionally(exception);
            } else {
                future.complete(sendResult);
            }
            LOGGER.info("Task status send to Kafka topic : " + value);
        });
    }
}
