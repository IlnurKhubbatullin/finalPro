package com.example.finalpro.exeption_person;

public class PersonNotRegisteredException extends RuntimeException {
    public PersonNotRegisteredException(String message) {
        super(message);
    }
}
