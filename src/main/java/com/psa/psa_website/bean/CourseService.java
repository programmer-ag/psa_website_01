package com.psa.psa_website.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psa.psa_website.entity.Course;
import com.psa.psa_website.repository.CourseRepository;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repository;

    public List<Course> getAllCourses() {
        return repository.findAll();
    }

    public Course saveCourse(Course course) {
        return repository.save(course);
    }

    public void deleteCourse(Long id) {
        repository.deleteById(id);
    }
}
