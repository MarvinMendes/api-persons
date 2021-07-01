package com.dio.api.persons.apipersons.controller;

import com.dio.api.persons.apipersons.domain.Person;
import com.dio.api.persons.apipersons.dto.PersonDTO;
import com.dio.api.persons.apipersons.exception.PersonNotFoundedException;
import com.dio.api.persons.apipersons.service.PersonService;
import org.aspectj.weaver.patterns.ReferencePointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/persons")
public class PersonController {

    private PersonService service;

    @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<PersonDTO> create(@RequestBody PersonDTO dto) {
        return new ResponseEntity<>(service.create(dto), HttpStatus.CREATED);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<PersonDTO>> getAll() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<PersonDTO> getById(@PathVariable Long id) throws PersonNotFoundedException {
        return new ResponseEntity<>(service.getById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    void delete(@PathVariable Long id) throws PersonNotFoundedException {
        service.delete(id);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<PersonDTO> replace(@RequestBody PersonDTO dto) throws PersonNotFoundedException {
        return new ResponseEntity<>(service.replace(dto), HttpStatus.ACCEPTED);
    }

}
