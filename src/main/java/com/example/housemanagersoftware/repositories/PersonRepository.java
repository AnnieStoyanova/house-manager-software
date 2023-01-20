package com.example.housemanagersoftware.repositories;

import com.example.housemanagersoftware.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    @Override
    Optional<Person> findById(Integer integer);

    @Query("SELECT p FROM Person p WHERE p.name = ?1")
    Optional<Person> findPersonByName(String name);
}
