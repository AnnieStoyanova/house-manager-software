package com.example.housemanagersoftware.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;


@Entity
@Table(name = "buildings")
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String number;
    @OneToMany
    private List<Floor> floors;
    private String address;
    private double commonParts;

    public Building(String number, List<Floor> floors, String address, double commonParts) {
        this.number = number;
        this.floors = floors;
        this.address = address;
        this.commonParts = commonParts;
    }

    public Building() {

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCommonParts() {
        return commonParts;
    }

    public void setCommonParts(double commonParts) {
        this.commonParts = commonParts;
    }



}
