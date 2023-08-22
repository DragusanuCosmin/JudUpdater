package com.example.judupdater.Service;

public interface EmailService {
    void sendMessage(String to, String subject, String text) throws RuntimeException;
}

