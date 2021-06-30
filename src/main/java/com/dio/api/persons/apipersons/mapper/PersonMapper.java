package com.dio.api.persons.apipersons.mapper;

import com.dio.api.persons.apipersons.domain.Person;
import com.dio.api.persons.apipersons.dto.PersonDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class PersonMapper {
    public static final PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd/MM/yyyy")
    public abstract Person toEntity(PersonDTO dto);

    public abstract PersonDTO toDTO(Person person);
}
