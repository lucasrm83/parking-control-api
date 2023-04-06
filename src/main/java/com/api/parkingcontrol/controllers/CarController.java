package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.services.CarService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {

    final CarService carService;


    public CarController(CarService carService) {
        this.carService = carService;
    }



}
