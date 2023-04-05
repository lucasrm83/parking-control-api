package com.api.parkingcontrol.services;


import com.api.parkingcontrol.entities.Car;
import com.api.parkingcontrol.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public boolean existByLicensePlateCar(String licensePlateCar) {
        return carRepository.existsByLicensePlateCar(licensePlateCar);
    }

    public Optional<Car> findByBrandCar(String brandCar){
        return carRepository.findBy()
    }

}
