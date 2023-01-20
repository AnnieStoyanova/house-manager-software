package com.example.housemanagersoftware.services;

import com.example.housemanagersoftware.model.Person;
import com.example.housemanagersoftware.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPeople() {
        return personRepository.findAll();
    }

    public void addNewPerson(Person person) {
        System.out.println(person);
    }
}
