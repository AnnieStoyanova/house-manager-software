package com.example.housemanagersoftware.services;

import com.example.housemanagersoftware.model.Person;
import com.example.housemanagersoftware.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
        Optional<Person> personOptional = personRepository.
                findPersonByName(person.getName());
        if (personOptional.isPresent()) {
            throw new IllegalStateException("Name taken");
        }
        personRepository.save(person);
    }

    public void deletePerson(Integer personId) {
        boolean exists = personRepository.existsById(personId);
        if (!exists) {
            throw new IllegalStateException("person with id " + personId + " does not exists");
        }
        personRepository.deleteById(personId);
    }


    @Transactional
    public void updatePerson(Integer personId, String name, Boolean useElevator) {
        Person person = personRepository.findById(personId)
                .orElseThrow(() -> new IllegalStateException(
                        "person with id " + personId + "does not exist"
                ));
        if (name != null && name.length() > 0 &&
                !Objects.equals(person.getName(), name)) {
            person.setName(name);
        }
        if (useElevator != null) {
            person.setUseElevator(useElevator);
        }
    }
}
