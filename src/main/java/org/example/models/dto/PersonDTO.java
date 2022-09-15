package org.example.models.dto;

public class PersonDTO {

    private String name;

    public PersonDTO( String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                ", name='" + name + '\'' +
                '}';
    }
}
