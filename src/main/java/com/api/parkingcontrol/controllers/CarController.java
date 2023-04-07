package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.entities.Car;
import com.api.parkingcontrol.services.CarService;
import org.apache.el.stream.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cars")
public class CarController {

    final CarService carService;


    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public ResponseEntity<List<Car>> getAllCars(){
        return ResponseEntity.status(HttpStatus.OK).body(carService.findAll());
    }

    @GetMapping("/{brandCar}")
    public ResponseEntity<List<Car>> getByBrandCar(@PathVariable(value = "brandCar") String brandCar){
        return ResponseEntity.status(HttpStatus.OK).body(carService.findByBrandCar(brandCar));
    }



}
