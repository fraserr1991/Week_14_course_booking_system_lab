package com.codeclan.bookingsystem.CourseBookingSystem.repositories;

import com.codeclan.bookingsystem.CourseBookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findCoursesByStarRating(Double starRating);
    List<Course> findCoursesByBookingsCustomerId(Long customerId);
}
