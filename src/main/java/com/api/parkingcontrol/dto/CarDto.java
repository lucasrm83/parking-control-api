package com.api.parkingcontrol.dto;

import jakarta.persistence.Column;

public class CarDto {
    @Column(nullable = false,unique = true, length =7)
    private String licensePlateCar;
    @Column(nullable = false,length =70)
    private String brandCar;
    @Column(nullable = false,length =70)
    private String modelCar;
    @Column(nullable = false,length =70)
    private String colorCar;

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
}
