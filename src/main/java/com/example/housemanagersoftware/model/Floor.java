package com.example.housemanagersoftware.model;

import com.example.housemanagersoftware.model.Apartment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "floors")
public class Floor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String number;
    @OneToMany
    private List<Apartment> apartments;

    public Floor(String number, List<Apartment> apartments) {
        this.number = number;
        this.apartments = apartments;
    }

    public Floor() {

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(List<Apartment> apartments) {
        this.apartments = apartments;
    }



}
