package com.psa.psa_website.rest_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.psa.psa_website.bean.CourseService;
import com.psa.psa_website.entity.Course;

import java.util.List;

@RestController
@RequestMapping("/courses")
//@CrossOrigin(origins = "http://localhost:5173")
public class CourseController {

    @Autowired
    private CourseService service;

    @GetMapping("info")
    public List<Course> getAll() {
        return service.getAllCourses();
    }

    @PostMapping("/add")
    public Course create(@RequestBody Course course) {
        return service.saveCourse(course);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteCourse(id);
    }
}
