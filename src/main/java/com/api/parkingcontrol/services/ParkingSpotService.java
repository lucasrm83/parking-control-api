package com.api.parkingcontrol.services;

import com.api.parkingcontrol.entities.ParkingSpot;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ParkingSpotService {

    @Autowired
    ParkingSpotRepository parkingSpotRepository;

    @Transactional
    public ParkingSpot save(ParkingSpot parkingSpot) {
        return parkingSpotRepository.save(parkingSpot);
    }



    public boolean existByParkingSpotNumber(String parkingSpotNumber) {
        return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existByApartmentAndBlock(String apartment, String block){
        return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
    }

    public Page<ParkingSpot> findAll(Pageable pageable) {
        return parkingSpotRepository.findAll(pageable);
    }

    public Optional<ParkingSpot> findById(UUID id) {
        return parkingSpotRepository.findById(id);
    }

    @Transactional
    public void delete(ParkingSpot parkingSpot) {
        parkingSpotRepository.delete(parkingSpot);
    }
}
