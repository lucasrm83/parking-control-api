package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CarRepository extends JpaRepository<Car, UUID> {
    boolean existsByLicensePlateCar(String licensePlateCar);


    /*@Query("select c from Car c where nomecampanha like %?1%")
    Optional<Car> findAllByBrandCar(String brandCar);*/
}
