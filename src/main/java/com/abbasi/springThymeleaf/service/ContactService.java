package com.abbasi.springThymeleaf.service;

import com.abbasi.springThymeleaf.model.Contact;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.logging.Level;
import java.util.logging.Logger;

@Service
//@RequestScope
//@SessionScope
@ApplicationScope
public class ContactService {
    private int callService = 0;

    public ContactService() {
        logger.log(Level.INFO,"PersonService is initialized ...");
    }

    private final Logger logger = Logger.getLogger(getClass().getName());
    public void addContact(Contact contact){
        this.callService++;
        logger.log(Level.INFO,"counter of call service: "+ callService);
        logger.log(Level.INFO, "Full Name: " + contact.getFullName());
        logger.log(Level.INFO, "Email: " + contact.getEmail());
        logger.log(Level.INFO, "Subject: " + contact.getSubject());
        logger.log(Level.INFO, "Message: " + contact.getMessage());
    }
}
