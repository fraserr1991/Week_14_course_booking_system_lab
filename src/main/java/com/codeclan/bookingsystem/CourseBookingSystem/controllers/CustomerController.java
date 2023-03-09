package com.codeclan.bookingsystem.CourseBookingSystem.controllers;

import com.codeclan.bookingsystem.CourseBookingSystem.models.Course;
import com.codeclan.bookingsystem.CourseBookingSystem.models.Customer;
import com.codeclan.bookingsystem.CourseBookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired //what is this?
    CustomerRepository customerRepository;

    @GetMapping(value = "customers")
    public ResponseEntity getAllCustomers(){
        return new ResponseEntity(customerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "customers/{id}")
    public ResponseEntity getCustomer(@PathVariable Long id){
        return new ResponseEntity<>(customerRepository.findById(id), HttpStatus.OK);
    }
}
