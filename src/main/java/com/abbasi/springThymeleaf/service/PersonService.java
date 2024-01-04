package com.abbasi.springThymeleaf.service;

import com.abbasi.springThymeleaf.model.Person;
import com.abbasi.springThymeleaf.model.Sexuality;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PersonService {
    public List<Person> getPersons() {

        return Arrays.asList(
                new Person("Jon", "Doe", (byte) 18, Sexuality.Man),
                new Person("Mike", "Rad", (byte) 26, Sexuality.Man),
                new Person("Niki", "Rox", (byte) 41, Sexuality.Woman),
                new Person("Susan", "Jones", (byte) 23, Sexuality.Woman)
        );
    }
}
