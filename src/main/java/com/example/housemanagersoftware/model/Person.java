package com.example.housemanagersoftware.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "people")
public class Person {

    @Id
    @SequenceGenerator(
            name = "person_sequence",
            sequenceName = "person_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "person_sequence"
    )
    private int id;
    private String name;
    private int age;
    boolean useElevator;
    @ManyToOne
    private Apartment apartment;

    public Person(String name, int age, boolean useElevator) {
        this.id = id++; // ?? see if it works
        this.name = name;
        this.age = age;
        this.useElevator = useElevator;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean useElevator() {
        return useElevator;
    }

    public void setUseElevator(boolean useElevator) {
        this.useElevator = useElevator;
    }


}
