package com.dio.api.persons.apipersons.service;

import com.dio.api.persons.apipersons.domain.Person;
import com.dio.api.persons.apipersons.repository.PersonRepository;
import com.dio.api.persons.apipersons.repository.PhoneRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class ServicePerson {

    private PersonRepository repository;
    private PhoneRepository phoneRepository;

    @Autowired
    public ServicePerson(PersonRepository repository, PhoneRepository phoneRepository) {
        this.repository = repository;
        this.phoneRepository = phoneRepository;
    }

    public Person create(Person person) {
        phoneRepository.saveAll(person.getPhones());
        return repository.save(person);
    }
}
