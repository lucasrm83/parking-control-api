package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface CarRepository extends JpaRepository<Car, UUID> {
    boolean existsByLicensePlateCar(String licensePlateCar);



    @Query(value = "SELECT * FROM Car WHERE brand_car LIKE %?1%", nativeQuery = true)
    List<Car> findByBrandCar(String brandCar);


}
