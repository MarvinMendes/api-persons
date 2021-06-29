package com.dio.api.persons.apipersons.controller;

import com.dio.api.persons.apipersons.domain.Person;
import com.dio.api.persons.apipersons.service.ServicePerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/persons")
public class PersonController {

    private ServicePerson service;

    @Autowired
    public PersonController(ServicePerson service) {
        this.service = service;
    }

    @PostMapping
    ResponseEntity<Person> create(@RequestBody Person person) {
        return ResponseEntity.ok(service.create(person));
    }
}
