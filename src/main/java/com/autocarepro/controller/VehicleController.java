package com.autocarepro.controller;

import com.autocarepro.dto.VehicleSummary;
import com.autocarepro.model.Vehicle;
import com.autocarepro.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @GetMapping
    public Page<Vehicle> getAllVehicles(Pageable pageable){
        return vehicleService.getAllVehicles(pageable);
    }

    @PostMapping
    public List<Vehicle> saveVehicle(@RequestBody List<Vehicle> vehicle){
        return vehicleService.saveVehicle(vehicle);
    }

    @GetMapping("/search")
    public List<Vehicle> findByMakeAndModel(String make,String model){
        return vehicleService.findByMakeAndModel(make,model);
    }

    @GetMapping("/summaries")
    public List<VehicleSummary> getAllVehiclesSummaries(){
        return vehicleService.getAllVehiclesSummaries();
    }
}
