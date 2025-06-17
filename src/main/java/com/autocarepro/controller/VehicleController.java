package com.autocarepro.controller;

import com.autocarepro.model.Vehicle;
import com.autocarepro.repository.VehicleRepository;
import com.autocarepro.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @GetMapping
    public List<Vehicle> getAllVehicles(){
        return vehicleService.getAllVehicles();
    }

    @PostMapping
    public Vehicle saveVehicle(@RequestBody Vehicle vehicle){
        return vehicleService.saveVehicle(vehicle);
    }
}
