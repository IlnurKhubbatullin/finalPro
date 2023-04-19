package com.example.finalpro.exeption_person;

public class PersonNotUpdatedException  extends RuntimeException {
    public PersonNotUpdatedException(String message) {
        super(message);
    }
}
