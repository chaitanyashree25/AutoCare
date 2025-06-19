package com.autocarepro.service;

import com.autocarepro.dto.VehicleSummary;
import com.autocarepro.model.Vehicle;
import com.autocarepro.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import java.util.List;

@Service
public class VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    public Page<Vehicle> getAllVehicles(Pageable pageable){
        return vehicleRepository.findAll(pageable);
    }

    public List<Vehicle> saveVehicle(List<Vehicle> vehicle){
        return vehicleRepository.saveAll(vehicle);
    }

    public List<Vehicle> findByMakeAndModel(String make, String model){
        return vehicleRepository.findByMakeAndModel(make,model);
    }

    public List<VehicleSummary> getAllVehiclesSummaries(){
        return vehicleRepository.findAllVehicleSummaries();
    }

    public List<Vehicle> searchByRegistrationNumber(String keyword){
        return vehicleRepository.searchByRegistrationNumberContains(keyword);
    }

    public List<Vehicle> findByModelIgnoreCase(String model){
        return vehicleRepository.findByModelIgnoreCase(model);
    }
}
