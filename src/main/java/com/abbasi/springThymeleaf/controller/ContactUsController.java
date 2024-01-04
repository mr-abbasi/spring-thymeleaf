package com.abbasi.springThymeleaf.controller;

import com.abbasi.springThymeleaf.model.Contact;
import com.abbasi.springThymeleaf.service.ContactService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactUsController {
    private final ContactService contactService;

    public ContactUsController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/contactus")
    public String contactUs(Model model) {
        model.addAttribute("contact",new Contact());
        return "contactus";
    }

    @PostMapping("/saveContactUs")
    public String saveContactUs(@Valid @ModelAttribute("contact") Contact contact, Errors errors) {
        if(errors.hasErrors()){
            return "contactus";
        }
        contactService.addContact(contact);

        return "index";
    }
}
