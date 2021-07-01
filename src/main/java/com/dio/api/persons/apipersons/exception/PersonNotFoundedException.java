package com.dio.api.persons.apipersons.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class PersonNotFoundedException extends Exception {
    public PersonNotFoundedException(Long id) {
        super(String.format("Person with Id %s was not founded in database", id));
    }

    public PersonNotFoundedException(String name) {
        super(String.format("Person with the name %s was not founded in database", name));
    }
}
