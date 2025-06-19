package com.autocarepro.repository;

import com.autocarepro.model.Vehicle;

import java.util.List;

public interface VehicleRepositoryCustom {

    List<Vehicle> findByModelIgnoreCase(String model);
}
