package com.abbasi.springThymeleaf.controller;

import com.abbasi.springThymeleaf.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public String getPersons(Model model){
        model.addAttribute("persons",personService.getPersons());

        return "persons";
    }
}
