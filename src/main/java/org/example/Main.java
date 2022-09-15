package org.example;

import org.example.mappers.PersonMapper;
import org.example.models.dto.PersonDTO;
import org.example.models.entities.Person;
import org.mapstruct.factory.Mappers;

public class Main {
    public static void main(String[] args) {

        PersonMapper mapper = Mappers.getMapper(PersonMapper.class);

        Person p = new Person(1L,"yassin");
        PersonDTO dto = mapper.toDto(p);
        System.out.println(dto);
    }
}