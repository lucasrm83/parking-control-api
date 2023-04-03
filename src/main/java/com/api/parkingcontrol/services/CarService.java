package com.api.parkingcontrol.services;


import com.api.parkingcontrol.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public boolean existByLicensePlateCar(String licensePlateCar) {
        return carRepository.existsByLicensePlateCar(licensePlateCar);
    }

}
