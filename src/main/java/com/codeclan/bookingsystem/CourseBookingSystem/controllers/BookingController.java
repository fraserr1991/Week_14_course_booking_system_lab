package com.codeclan.bookingsystem.CourseBookingSystem.controllers;

import com.codeclan.bookingsystem.CourseBookingSystem.models.Booking;
import com.codeclan.bookingsystem.CourseBookingSystem.models.Course;
import com.codeclan.bookingsystem.CourseBookingSystem.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @Autowired //what is this?
    BookingRepository bookingRepository;

    @GetMapping(value = "bookings")
    public ResponseEntity getAllBookings(){
        return new ResponseEntity(bookingRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "bookings/{id}")
    public ResponseEntity getBooking(@PathVariable Long id){
        return new ResponseEntity<>(bookingRepository.findById(id), HttpStatus.OK);
    }
}
