package com.dio.api.persons.apipersons.service;

import com.dio.api.persons.apipersons.dto.PersonDTO;
import com.dio.api.persons.apipersons.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PhoneService {

    private PhoneRepository repository;

    @Autowired
    public PhoneService(PhoneRepository phoneRepository) {
        this.repository = phoneRepository;
    }

    public PhoneService() {
    }

    @Transactional
    public void createPhone(PersonDTO person) {
        repository.saveAll(person.getPhones());
    }


}
