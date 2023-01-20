package com.example.housemanagersoftware.repositories;

import com.example.housemanagersoftware.model.HouseManagerCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HouseManagerCompanyRepository extends JpaRepository<HouseManagerCompany, Integer> {

 HouseManagerCompany save(HouseManagerCompany company);

 void delete(HouseManagerCompany company);

 Optional<HouseManagerCompany> findHouseManagerCompanyById(int id);

}
