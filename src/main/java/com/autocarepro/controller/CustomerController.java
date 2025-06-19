package com.autocarepro.controller;

import com.autocarepro.model.Customer;
import com.autocarepro.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @PostMapping
    public List<Customer> saveCustomer(@RequestBody List<Customer> customer){
        return customerService.saveCustomer(customer);
    }

}
