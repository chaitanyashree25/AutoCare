package com.autocarepro.repository;

import com.autocarepro.model.ServiceAppointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceAppointmentRepository extends JpaRepository<ServiceAppointment,Integer> {
}
