package com.abbasi.springThymeleaf.model;

public class Person {
    private String firstName;
    private String lastName;
    private byte age;
    private Sexuality sexuality;

    public Person(String firstName, String lastName, byte age, Sexuality sexuality) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSexuality(sexuality);

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Sexuality getSexuality() {
        return sexuality;
    }

    public void setSexuality(Sexuality sexuality) {
        this.sexuality = sexuality;
    }
}

