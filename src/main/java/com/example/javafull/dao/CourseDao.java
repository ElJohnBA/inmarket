package com.example.javafull.dao;

import com.example.javafull.models.Course;

import java.util.List;

public interface CourseDao {

    public Course getCourse(Long code);
    public List<Course> getCourses();
    void deleteCourse(Long code);
    void createCourse(Course student);

}
