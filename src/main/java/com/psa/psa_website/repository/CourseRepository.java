package com.psa.psa_website.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.psa.psa_website.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    // Standard CRUD methods are already included!
}