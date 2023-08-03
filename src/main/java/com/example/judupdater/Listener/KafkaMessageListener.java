package com.example.judupdater.Listener;

import com.example.judupdater.Email.EmailService;
import com.example.judupdater.Entities.Clienti;
import com.example.judupdater.Entities.Dosare;
import com.example.judupdater.Service.ClientiService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class KafkaMessageListener {
    private Dosare previousDosare;
    private final EmailService emailService;
    private final ClientiService clientiService;

    public KafkaMessageListener(EmailService emailService, ClientiService clientiService) {
        this.emailService = emailService;
        this.clientiService = clientiService;
    }

    @KafkaListener(topics = "dosare_noi", containerFactory = "kafkaListenerContainerFactory", groupId = "group_id")
    public void receiveMessage(Dosare dosare) {
        if (previousDosare != null && !Objects.equals(dosare.getDetaliiDosar(), previousDosare != null ? previousDosare.getDetaliiDosar() : null)) {
            System.out.println("Mesaj schimbat. Se trimite email");
            Clienti client = clientiService.getClientById(dosare.getIdClient());

            if (client != null) {
                emailService.sendMessage(client.getEmail(), "Schimbare dosar", "Dosarul dumneavoastra a fost schimbat: " + dosare.getDetaliiDosar());
            } else {
                System.out.println("Client invalid: " + dosare.getIdClient());
            }
        }
        previousDosare = dosare;
    }
}
