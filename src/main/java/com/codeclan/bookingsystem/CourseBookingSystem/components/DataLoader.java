package com.codeclan.bookingsystem.CourseBookingSystem.components;

import com.codeclan.bookingsystem.CourseBookingSystem.models.Booking;
import com.codeclan.bookingsystem.CourseBookingSystem.models.Course;
import com.codeclan.bookingsystem.CourseBookingSystem.models.Customer;
import com.codeclan.bookingsystem.CourseBookingSystem.repositories.BookingRepository;
import com.codeclan.bookingsystem.CourseBookingSystem.repositories.CourseRepository;
import com.codeclan.bookingsystem.CourseBookingSystem.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component //what is this?
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) { //does this mean run this first?

        Course mathCourse = new Course("Maths", "Livi", 2.0);
        courseRepository.save(mathCourse);
        Course physicsCourse = new Course("Physics", "Edinburgh", 3.6);
        courseRepository.save(physicsCourse);
        Course craftAndDesignCourse = new Course("Craft and deisgn", "Somaliland", 4.9);
        courseRepository.save(craftAndDesignCourse);

        Customer fred = new Customer("Fred", "Bedrock", 40);
        customerRepository.save(fred);
        Customer wilma = new Customer("Wilma", "Bedrock", 32);
        customerRepository.save(wilma);
        Customer barney = new Customer("Barney", "Bedrock", 45);
        customerRepository.save(barney);
        Customer jeffery = new Customer("Jeffery", "Downtown LA", 8);
        customerRepository.save(jeffery);

        Booking booking1 = new Booking("12/12/2023", mathCourse, fred);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("01/06/2023", physicsCourse, wilma);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("12/12/2023", mathCourse, barney);
        bookingRepository.save(booking3);
        Booking booking4 = new Booking("18/09/2023", craftAndDesignCourse, jeffery);
        bookingRepository.save(booking4);




    }
}
