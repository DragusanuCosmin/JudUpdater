package com.example.judupdater.Listener;

import com.example.judupdater.Dao.ClientiDao;
import com.example.judupdater.Email.EmailService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class KafkaMessageListener {
    private final EmailService emailSenderService;
    private final ClientiDao clientiDao;
    @Autowired
    public KafkaMessageListener(EmailService emailSenderService,@Qualifier("ClientiDao") ClientiDao clientiDao) {
        this.emailSenderService = emailSenderService;
        this.clientiDao = clientiDao;
    }
    @KafkaListener(topics = "dosare_noi", groupId = "test-consumer-group")
    public void listen(int dosarId) {
    }

}
