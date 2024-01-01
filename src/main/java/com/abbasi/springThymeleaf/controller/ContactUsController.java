package com.abbasi.springThymeleaf.controller;

import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class ContactUsController {
    private final Logger logger = Logger.getLogger(getClass().getName());

    @GetMapping("/contactus")
    public String contactUs() {
        return "contactus";
    }

    @PostMapping("/saveContactUs")
    public String saveContactUs(@RequestParam String fullName, @RequestParam String email,
                                @RequestParam String subject, @RequestParam String message) {
        logger.log(Level.INFO, "Full Name: " + fullName);
        logger.log(Level.INFO, "Email: " + email);
        logger.log(Level.INFO, "Subject: " + subject);
        logger.log(Level.INFO, "Message: " + message);

        return "index";
    }
}
