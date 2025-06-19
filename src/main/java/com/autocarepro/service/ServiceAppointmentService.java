package com.autocarepro.service;

import com.autocarepro.model.ServiceAppointment;
import com.autocarepro.repository.ServiceAppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAppointmentService {

    @Autowired
    ServiceAppointmentRepository serviceAppointmentRepository;

    public List<ServiceAppointment> getAllAppointments(){
        return serviceAppointmentRepository.findAll();
    }

    public List<ServiceAppointment> saveAppointment(List<ServiceAppointment> appointment){
        return serviceAppointmentRepository.saveAll(appointment);
    }
}
