package com.codeclan.bookingsystem.CourseBookingSystem.repositories;

import com.codeclan.bookingsystem.CourseBookingSystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
