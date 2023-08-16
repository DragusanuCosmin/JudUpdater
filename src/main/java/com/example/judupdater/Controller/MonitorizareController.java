package com.example.judupdater.Controller;

import com.example.judupdater.Email.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dosare")
public class MonitorizareController {
    private final EmailService emailSenderService;
    @Autowired

    public MonitorizareController(EmailService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }

    @GetMapping("/email")
    public void sendMail() {
        emailSenderService.sendMessage("cosmind668@gmail.com","Schimbarea dosarului" , "Schimbarea dosarului");
    }
}
