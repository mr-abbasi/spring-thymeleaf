package com.abbasi.springThymeleaf.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Contact {
    private String fullName;
    private String email;
    private String subject;
    private String message;
}
