package com.abbasi.springThymeleaf.model;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Contact {
    @NotEmpty(message = "Full Name is required")
    @Size(min = 3,max = 40,message = "Full Name must be between 3 and 40")
    @Pattern(regexp = "[a-zA-Z ]+",message = "Only alphabetic chars are allowed for Full Name")
    private String fullName;

    @Email(message = "Email isn't correct")
    @NotBlank(message = "Email is Required")
    private String email;

    @NotBlank(message = "Subject is required")
    @Size(min=3,max = 50,message = "Subject must be between 3 and 50")
    private String subject;

    @NotBlank
    @Size(min=10,max = 200,message = "Message must be between 10 and 200")
    private String message;
}
