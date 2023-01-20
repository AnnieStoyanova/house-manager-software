package com.example.housemanagersoftware.model;

import com.example.housemanagersoftware.model.Employee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "companies")
public class HouseManagerCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany
    private List<Employee> employeeList;
    @OneToMany
    private List<Building> buildingList;

    public HouseManagerCompany(String name) {
        this.name = name;
        this.employeeList = new ArrayList<>();
    }

    public HouseManagerCompany(String name, List<Employee> employeeList) {
        this.id = id++;
        this.name = name;
        this.employeeList = employeeList;
    }

    public HouseManagerCompany() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }



}
