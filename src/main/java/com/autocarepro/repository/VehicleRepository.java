    package com.autocarepro.repository;

    import com.autocarepro.model.Vehicle;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.data.jpa.repository.Query;
    import org.springframework.data.repository.query.Param;

    import java.util.List;
    import java.util.Optional;

    public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

        Optional<Vehicle> findByRegistrationNumber(String registrationNumber);

        @Query("SELECT v FROM Vehicle v WHERE v.make = :make AND v.model = :model")
        List<Vehicle> findByMakeAndModel(@Param("make") String make, @Param("model") String model);
    }
