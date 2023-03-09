package com.codeclan.bookingsystem.CourseBookingSystem.controllers;

import com.codeclan.bookingsystem.CourseBookingSystem.models.Course;
import com.codeclan.bookingsystem.CourseBookingSystem.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired //what is this?
    CourseRepository courseRepository;

    @GetMapping(value = "courses")
    public ResponseEntity getAllCourses(){
        return new ResponseEntity(courseRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "courses/{id}")
    public ResponseEntity getCourse(@PathVariable Long id){
        return new ResponseEntity<>(courseRepository.findById(id), HttpStatus.OK);
    }
}
