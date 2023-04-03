package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.entities.Car;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, UUID> {
    boolean existsByLicensePlateCar(String licensePlateCar);


}
