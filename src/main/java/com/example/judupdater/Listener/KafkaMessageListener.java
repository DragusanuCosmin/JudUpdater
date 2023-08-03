package com.example.judupdater.Listener;

import com.example.judupdater.Email.EmailService;
import com.example.judupdater.Entities.Clienti;
import com.example.judupdater.Entities.Dosare;
import com.example.judupdater.Service.ClientiService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaMessageListener {
    private Dosare previousDosare;
    private final EmailService emailService;
    private final ClientiService clientiService;

    public KafkaMessageListener(EmailService emailService, ClientiService clientiService) {
        this.emailService = emailService;
        this.clientiService = clientiService;
    }

    @KafkaListener(topics = "dosare_noi", containerFactory = "kafkaListenerContainerFactory")
    public void receiveMessage(Dosare dosare) {
        if (previousDosare != null && !dosare.getDetaliiDosar().equals(previousDosare.getDetaliiDosar())) {
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
