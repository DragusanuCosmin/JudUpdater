package com.example.judupdater.Listener;

import com.example.judupdater.Email.EmailService;
import com.example.judupdater.Entities.Clienti;
import com.example.judupdater.Entities.Message;
import com.example.judupdater.Service.ClientiService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageListener {
    private Message previousMessage;
    private final EmailService emailService;
    private final ClientiService clientiService;

    public KafkaMessageListener(EmailService emailService, ClientiService clientiService) {
        this.emailService = emailService;
        this.clientiService = clientiService;
    }

    @KafkaListener(topics = "dosare_noi", containerFactory = "kafkaListenerContainerFactory")
    public void receiveMessage(Message message) {
        if (previousMessage != null && !message.getContent().equals(previousMessage.getContent())) {
            System.out.println("Mesaj schimbat. Se trimite email");
            Clienti client = clientiService.getClientById(message.getIdClient());

            if (client != null) {
                emailService.sendMessage(client.getEmail(), "Schimbare dosar", "Dosarul dumneavoastra a fost schimbat: " + message.getContent());
            } else {
                System.out.println("Client invalid: " + message.getIdClient());
            }
        }
        previousMessage = message;
    }
}
