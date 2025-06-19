    package com.autocarepro.repository;

    import com.autocarepro.dto.VehicleSummary;
    import com.autocarepro.model.Vehicle;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.data.jpa.repository.Query;
    import org.springframework.data.repository.query.Param;

    import java.util.List;
    import java.util.Optional;

    public interface VehicleRepository extends JpaRepository<Vehicle, Integer> , VehicleRepositoryCustom{

        Optional<Vehicle> findByRegistrationNumber(String registrationNumber);

        @Query("SELECT v FROM Vehicle v WHERE v.make = :make AND v.model = :model")
        List<Vehicle> findByMakeAndModel(@Param("make") String make, @Param("model") String model);

        @Query("SELECT v.make AS make, v.model AS model, v.registrationNumber AS registrationNumber FROM Vehicle v")
        List<VehicleSummary> findAllVehicleSummaries();

        @Query(value = "SELECT * FROM vehicle WHERE registration_number LIKE %:keyword%",nativeQuery = true)
        List<Vehicle> searchByRegistrationNumberContains(@Param("keyword") String keyword);
    }

