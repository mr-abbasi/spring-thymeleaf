package com.abbasi.springThymeleaf.controller;

import com.abbasi.springThymeleaf.model.Contact;
import com.abbasi.springThymeleaf.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactUsController {
    private final ContactService contactService;

    public ContactUsController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/contactus")
    public String contactUs() {
        return "contactus";
    }

    @PostMapping("/saveContactUs")
    public String saveContactUs(Contact contact) {
        contactService.addContact(contact);

        return "index";
    }
}
