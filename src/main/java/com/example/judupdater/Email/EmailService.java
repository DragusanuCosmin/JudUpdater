package com.example.judupdater.Email;

public interface EmailService {
    void sendMessage(String to, String subject, String text) throws RuntimeException;
}

