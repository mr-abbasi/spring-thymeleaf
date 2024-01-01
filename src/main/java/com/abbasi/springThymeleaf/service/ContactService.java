package com.abbasi.springThymeleaf.service;

import com.abbasi.springThymeleaf.model.Contact;
import org.springframework.stereotype.Service;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class ContactService {

    private final Logger logger = Logger.getLogger(getClass().getName());
    public void addContact(Contact contact){
        logger.log(Level.INFO, "Full Name: " + contact.getFullName());
        logger.log(Level.INFO, "Email: " + contact.getEmail());
        logger.log(Level.INFO, "Subject: " + contact.getSubject());
        logger.log(Level.INFO, "Message: " + contact.getMessage());
    }
}
