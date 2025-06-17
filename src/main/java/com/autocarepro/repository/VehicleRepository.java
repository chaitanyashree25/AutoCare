    package com.autocarepro.repository;

    import com.autocarepro.model.Vehicle;
    import org.springframework.data.jpa.repository.JpaRepository;

    import java.util.Optional;

    public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

        Optional<Vehicle> findByRegistrationNumber(String registrationNumber);
    }
