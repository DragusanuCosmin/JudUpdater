package com.example.judupdater.Listener;

import com.example.judupdater.Email.EmailService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
public class KafkaMessageListener {
    @Autowired
    private EmailService emailSenderService;
    //@Autowired
    //private SearchDosarOwner searchDosarOwner;
    @KafkaListener(topics = "dosare_noi", groupId = "test-consumer-group")
    public void listen(String in) {
        System.out.println("S-a introdus dosarul nr: " + in);
        emailSenderService.sendMessage("luci@ctce.ro" , "Noutati in dosarul" + in, "Modificari in dosarul" + in);
      //  searchDosarOwner.sendEmailForDosar(in);
    }

}
