package com.codeclan.bookingsystem.CourseBookingSystem.repositories;

import com.codeclan.bookingsystem.CourseBookingSystem.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
