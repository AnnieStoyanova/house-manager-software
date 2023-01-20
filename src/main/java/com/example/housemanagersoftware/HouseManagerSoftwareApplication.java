package com.example.housemanagersoftware;

import com.example.housemanagersoftware.model.Apartment;
import com.example.housemanagersoftware.model.Building;
import com.example.housemanagersoftware.model.Floor;
import com.example.housemanagersoftware.model.Person;
import com.example.housemanagersoftware.repositories.HouseManagerCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HouseManagerSoftwareApplication {

    @Autowired
    public HouseManagerCompanyRepository houseManagerCompanyRepository;

    public static void main(String[] args) {

        SpringApplication.run(HouseManagerSoftwareApplication.class, args);


        // People
        Person krisi = new Person("Kristina", 16, false);
        Person sasho = new Person("Alexander", 47, false);
        Person valya = new Person("Valentina", 52, false);
        Person ani = new Person("Anna", 21, false);
        List inhabitantsStoyanovi = new ArrayList();
        inhabitantsStoyanovi.add(krisi);
        inhabitantsStoyanovi.add(sasho);
        inhabitantsStoyanovi.add(valya);

        Person gogo = new Person("Georgi", 23, false);
        Person toni = new Person("Teodor", 21, true);
        Person mitko = new Person("Dimitar", 16, true);
        List inhabitantsSlavovi = new ArrayList();
        inhabitantsSlavovi.add(toni);
        inhabitantsSlavovi.add(mitko);

        List inhabitantsOfTwo = new ArrayList();
        inhabitantsOfTwo.add(gogo);
        inhabitantsOfTwo.add(ani);


        // Apartments

        Apartment apartOfStoyanovi = new Apartment("77A", 120, sasho, inhabitantsStoyanovi, 0);
        Apartment apartOfSlavovi = new Apartment("33A", 100, gogo, inhabitantsSlavovi, 1);
        Apartment apartmentForTwo = new Apartment("21A", 130, gogo,inhabitantsOfTwo, 2);
        List apartmentsOfFirstBuilding = new ArrayList();
        List apartmentsOfSecondBuilding = new ArrayList();
        List apartmentsOfThirdBuilding = new ArrayList();
        apartmentsOfFirstBuilding.add(apartOfStoyanovi);
        apartmentsOfSecondBuilding.add(apartOfSlavovi);
        apartmentsOfThirdBuilding.add(apartmentForTwo);

        // Floors
        Floor firstFloor = new Floor("1", apartmentsOfFirstBuilding);
        Floor secondFloor = new Floor("2", apartmentsOfSecondBuilding);
        Floor thirdFloor = new Floor("3", apartmentsOfThirdBuilding);
        List floorsEmpireState = new ArrayList(); floorsEmpireState.add(firstFloor);
        List floorsBricksAndMore = new ArrayList(); floorsBricksAndMore.add(secondFloor);
        List floorsMillenium = new ArrayList(); floorsMillenium.add(apartmentForTwo);


        // Buildings
        Building empireState = new Building("22B", floorsEmpireState, "States, 34", 234.45);
        Building bricksAndMore = new Building("56B", floorsBricksAndMore, "India, 67", 704.45);
        Building millenium = new Building("88B", floorsMillenium, "Bulgaria, 21", 344.45);





    }




}
