package com.dio.api.persons.apipersons.service;

import com.dio.api.persons.apipersons.domain.Person;
import com.dio.api.persons.apipersons.dto.PersonDTO;
import com.dio.api.persons.apipersons.exception.PersonNotFoundedException;
import com.dio.api.persons.apipersons.mapper.PersonMapper;
import com.dio.api.persons.apipersons.repository.PersonRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

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

    @Transactional(readOnly = true)
    public List<PersonDTO> getAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }


    @Transactional(readOnly = true)
    public PersonDTO getById(Long id) throws PersonNotFoundedException {
        Person personFounded = findById(id);
        return mapper.toDTO(personFounded);
    }

    private Person findById(Long id) throws PersonNotFoundedException {
        return repository.findById(id).orElseThrow(() -> new PersonNotFoundedException(id));
    }

    public void delete(Long id) throws PersonNotFoundedException {
        Person person = findById(id);
        repository.delete(person);
    }


    public PersonDTO replace(PersonDTO dto) throws PersonNotFoundedException {
        findById(dto.getId());
        PersonDTO personUpdatet = create(dto);
        return personUpdatet;
    }
}
