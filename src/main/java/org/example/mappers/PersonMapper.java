package org.example.mappers;

import org.example.models.dto.PersonDTO;
import org.example.models.entities.Person;
import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper {
    PersonDTO toDto(Person person);
    Person toEntities(PersonDTO person);
}
