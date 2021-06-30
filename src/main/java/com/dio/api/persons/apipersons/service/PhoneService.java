package com.dio.api.persons.apipersons.service;

import com.dio.api.persons.apipersons.dto.PersonDTO;
import com.dio.api.persons.apipersons.repository.PhoneRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@NoArgsConstructor
public class PhoneService {

    private PhoneRepository repository;

    @Autowired
    public PhoneService(PhoneRepository phoneRepository) {
        this.repository = phoneRepository;
    }

    @Transactional
    public void createPhone(PersonDTO person) {
        repository.saveAll(person.getPhones());
    }


}
