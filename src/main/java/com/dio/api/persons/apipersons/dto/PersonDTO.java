package com.dio.api.persons.apipersons.dto;

import com.dio.api.persons.apipersons.domain.Phone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO {

    private Long id;

    @NotEmpty
    @Size(min = 3, max = 100)
    private String firstName;

    @Size(min = 3, max = 100)
    private String lastName;

    @CPF
    private String cpf;

    @Column(nullable = false, name = "birthDate")
    private LocalDate birthDate;

    @NotEmpty
    private Set<Phone> phones;

}
