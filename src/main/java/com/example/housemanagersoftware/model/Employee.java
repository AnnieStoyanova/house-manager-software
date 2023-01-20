package com.example.housemanagersoftware.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private String id;
    @OneToMany
    private List<Building> buildings;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
        this.buildings = new ArrayList<>();
    }

    public Employee(String name, String id, List<Building> buildingList) {
        this.name = name;
        this.id = id;
        this.buildings = buildingList;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildingList) {
        this.buildings = buildingList;
    }
}
