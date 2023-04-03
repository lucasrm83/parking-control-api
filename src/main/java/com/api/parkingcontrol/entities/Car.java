package com.api.parkingcontrol.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Car{

    @Id
    private UUID id;
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public Car(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
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
