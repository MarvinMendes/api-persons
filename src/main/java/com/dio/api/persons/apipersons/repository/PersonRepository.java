package com.dio.api.persons.apipersons.repository;

import com.dio.api.persons.apipersons.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
