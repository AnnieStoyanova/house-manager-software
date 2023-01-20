package com.example.housemanagersoftware.repositories;

import com.example.housemanagersoftware.model.Floor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FloorRepository extends JpaRepository<Floor, Integer> {

    Floor save(Floor floor);

    void delete(Floor floor);

    Optional<Floor> findFloorByNumber(String number);
}
