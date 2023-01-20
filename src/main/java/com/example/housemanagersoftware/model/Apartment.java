package com.example.housemanagersoftware.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "apartments")
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String number;
    private double area;
    @OneToOne
    private Person owner;
    @OneToMany (mappedBy = "apartment")
    private List<Person> inhabitants;
    private int numberOfPetsUsingElevator;  // може да има няколко такива животни
    private double apartmentTax;

    // without tax -> it is calculated later
    public Apartment(String number, double area, Person owner, List<Person> inhabitants, int numberOfPetsUsingElevator) {
        this.number = number;
        this.area = area;
        this.owner = owner;
        this.inhabitants = inhabitants;
        this.numberOfPetsUsingElevator = numberOfPetsUsingElevator;
    }

    public Apartment() {

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public List<Person> getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(List<Person> inhabitants) {
        this.inhabitants = inhabitants;
    }

    public int getNumberOfPetsUsingElevator() {
        return numberOfPetsUsingElevator;
    }

    public void setNumberOfPetsUsingElevator(int numberOfPetsUsingElevator) {
        this.numberOfPetsUsingElevator = numberOfPetsUsingElevator;
    }

    // returns calculated tax in a method
    public double getApartmentTax() {
        return apartmentTax;
    }

    // first calculated in a method
    public void setApartmentTax(double apartmentTax) {
        this.apartmentTax = apartmentTax;
    }
}
