package com.example.javafull.controller;

import com.example.javafull.dao.CourseDao;
import com.example.javafull.models.Course;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "api/")
public class CourseController {

    CourseDao courseDao;

    public CourseController(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @GetMapping(value = "course/{code}")
    public Course getCourse(@PathVariable Long code) {
        return courseDao.getCourse(code);
    }

    @GetMapping(value = "courses")
    public List<Course> getCourses() {
        return courseDao.getCourses();
    }

    @PostMapping(value = "course")
    public void createCourse(@RequestBody Course course) {
        courseDao.createCourse(course);
    }

    @DeleteMapping(value = "course/{code}")
    public void deleteCourse(@PathVariable Long code) {
        courseDao.deleteCourse(code);
    }
}
