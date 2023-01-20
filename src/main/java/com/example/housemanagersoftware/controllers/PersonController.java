package com.example.housemanagersoftware.controllers;

import com.example.housemanagersoftware.model.Person;
import com.example.housemanagersoftware.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "api/v1/person")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getPeople() {
      return personService.getPeople();
    }

    @PostMapping
    public void registerNewPerson(@RequestBody Person person) {
        personService.addNewPerson(person);
    }

    @DeleteMapping(path = "{personId}")
    public void deletePerson(@PathVariable("personId") Integer personId) {
        personService.deletePerson(personId);
    }

    @PutMapping(path="{personId}")
    public void updatePerson(
            @PathVariable("personId") Integer personId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Boolean useElevator) {
        personService.updatePerson(personId, name, useElevator);
    }


}
