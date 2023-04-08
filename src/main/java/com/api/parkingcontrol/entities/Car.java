package com.api.parkingcontrol.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.UUID;

@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
@Entity
public class Car{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false,unique = true, length =7)
    private String licensePlateCar;
    @Column(nullable = false,length =70)
    private String brandCar;
    @Column(nullable = false,length =70)
    private String modelCar;
    @Column(nullable = false,length =70)
    private String colorCar;

    @OneToOne

    private ParkingSpot parkingSpot;

    public Car() {
        this.parkingSpot = parkingSpot;
    }

    public Car(String licensePlateCar, String brandCar, String modelCar, String colorCar,ParkingSpot parkingSpot) {
        this.licensePlateCar = licensePlateCar;
        this.brandCar = brandCar;
        this.modelCar = modelCar;
        this.colorCar = colorCar;
        this.parkingSpot= parkingSpot;

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
