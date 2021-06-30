package com.dio.api.persons.apipersons.mapper;

import com.dio.api.persons.apipersons.domain.Person;
import com.dio.api.persons.apipersons.dto.PersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class PersonMapper {
    public static final PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    public abstract Person toEntity(PersonDTO dto);

    public abstract PersonDTO toDTO(Person person);
}
