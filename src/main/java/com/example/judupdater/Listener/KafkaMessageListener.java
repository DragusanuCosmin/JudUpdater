package com.example.judupdater.Listener;

import com.example.judupdater.Dao.ClientiDao;
import com.example.judupdater.Dao.ContacteClientiDao;
import com.example.judupdater.Email.EmailService;
import com.example.judupdater.Entities.Clienti;
import com.example.judupdater.Entities.ContacteClienti;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class KafkaMessageListener {
    private final EmailService emailSenderService;
    private final ContacteClientiDao contacteClientiDao;
    private final ClientiDao clientiDao;
    @Autowired
    public KafkaMessageListener(EmailService emailSenderService,@Qualifier("ContacteClientiDao") ContacteClientiDao contacteClientiDao,@Qualifier("ClientiDao") ClientiDao clientiDao) {
        this.emailSenderService = emailSenderService;
        this.contacteClientiDao = contacteClientiDao;
        this.clientiDao = clientiDao;
    }
    @KafkaListener(topics = "dosare_noi", groupId = "test-consumer-group")
    public void listen(int dosarId) {
        System.out.println("S-a introdus dosarul nr: " + dosarId);
        ContacteClienti contacteClienti=contacteClientiDao.getClienti(dosarId);
        emailSenderService.sendMessage("luci@ctce.ro" , "Noutati in dosarul" + dosarId, "Modificari in dosarul" + dosarId);
        System.out.println("S-a gasit detinatorul dosarului " + dosarId+":"+"si se va trimite mail la adresa:"+contacteClienti.getEmail());
        if(!contacteClienti.isValid())
            System.out.println("Datele de contact ale clientului nu sunt valide");
        if(!clientiDao.gasireClient(contacteClienti.getId_client()).isValid())
            System.out.println("Clientul nu este valid");
    }

}
