package com.dio.api.persons.apipersons.service;

import com.dio.api.persons.apipersons.domain.Person;
import com.dio.api.persons.apipersons.dto.PersonDTO;
import com.dio.api.persons.apipersons.mapper.PersonMapper;
import com.dio.api.persons.apipersons.repository.PersonRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@NoArgsConstructor
public class PersonService {

    private PersonRepository repository;
    private PhoneService phoneService;
    private final PersonMapper mapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository repository, PhoneService phoneService) {
        this.repository = repository;
        this.phoneService = phoneService;
    }

    @Transactional
    public PersonDTO create(PersonDTO dto) {
        phoneService.createPhone(dto);
        Person personSaved = repository.save(mapper.toEntity(dto));
        return mapper.toDTO(personSaved);
    }



}
