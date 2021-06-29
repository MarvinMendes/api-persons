package com.dio.api.persons.apipersons.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/persons")
public class PersonController {

    @GetMapping
    String helloWorld() {
        return "Olá mundo!";
    }
}
