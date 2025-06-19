package com.autocarepro.controller;

import com.autocarepro.model.ServiceAppointment;
import com.autocarepro.service.ServiceAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointment")
public class ServiceAppointmentController {


    @Autowired
    ServiceAppointmentService serviceAppointmentService;

    @GetMapping
    public List<ServiceAppointment> getAllAppointments(){
      return  serviceAppointmentService.getAllAppointments();
    }

    @PostMapping
    public List<ServiceAppointment> saveAppointment(@RequestBody List<ServiceAppointment> serviceAppointment){
        return serviceAppointmentService.saveAppointment(serviceAppointment);
    }

}
