package com.abbasi.springThymeleaf.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
    private byte age;
    private Sexuality sexuality;
}

