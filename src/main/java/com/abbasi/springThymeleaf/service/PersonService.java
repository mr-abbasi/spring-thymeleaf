package com.abbasi.springThymeleaf.service;

import com.abbasi.springThymeleaf.model.Person;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class PersonService {
    public List<Person> getPersons(){

        return Arrays.asList(
                new Person("Jon","Doe",(byte)18),
                new Person("Mike","Rad",(byte)18),
                new Person("Niki","Rox",(byte)18)
        );
    }
}
