package com.codeclan.bookingsystem.CourseBookingSystem.repositories;

import com.codeclan.bookingsystem.CourseBookingSystem.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findBookingsByDate(String date);
}
