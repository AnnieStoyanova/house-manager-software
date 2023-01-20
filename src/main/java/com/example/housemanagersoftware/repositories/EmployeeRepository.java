package com.example.housemanagersoftware.repositories;

import com.example.housemanagersoftware.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee save(Employee employee);

    void delete(Employee employee);

    Optional<Employee> findEmployeeById(String id);
}
