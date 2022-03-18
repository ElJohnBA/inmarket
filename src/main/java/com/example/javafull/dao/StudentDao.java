package com.example.javafull.dao;

import com.example.javafull.models.Student;

import java.util.List;

public interface StudentDao {

    public Student getStudent(Long id);
    public List<Student> getStudents();
    void deleteStudent(Long id);
    void createStudent(Student student);

}
