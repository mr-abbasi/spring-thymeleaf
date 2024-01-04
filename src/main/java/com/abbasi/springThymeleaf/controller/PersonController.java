package com.abbasi.springThymeleaf.controller;

import com.abbasi.springThymeleaf.model.Sexuality;
import com.abbasi.springThymeleaf.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.stream.Collectors;

@Controller
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping({"persons","/persons/{sexuality}"})
    public String getPersons(@PathVariable(required = false) Sexuality sexuality, Model model) {
        var persons = personService.getPersons();
        if (sexuality != null) {
            persons = persons.stream().filter(p -> p.getSexuality() == sexuality).collect(Collectors.toList());
        }
        model.addAttribute("persons", persons);

        return "persons";
    }
}
