package com.example.housemanagersoftware;

import com.example.housemanagersoftware.model.Apartment;
import com.example.housemanagersoftware.model.Person;
import com.example.housemanagersoftware.repositories.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PersonConfig {

    @Bean
    CommandLineRunner commandLineRunner(PersonRepository repository) {
        return args -> {
            Person mariam = new Person("Mariam", 21, true, new Apartment());
            Person antonio = new Person("Antonio", 23, true, new Apartment());
            repository.saveAll(List.of(mariam, antonio));
        };


    }
}
