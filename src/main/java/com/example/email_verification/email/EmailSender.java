package com.example.email_verification.email;

public interface EmailSender {
    void send(String to, String email);
}
