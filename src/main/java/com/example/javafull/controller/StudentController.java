package com.example.javafull.controller;

import com.example.javafull.dao.StudentDao;
import com.example.javafull.models.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/")
public class StudentController {

    StudentDao studentDao;

    public StudentController(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @GetMapping(value = "student/{id}")
    public Student getStudent(@PathVariable Long id) {
        return studentDao.getStudent(id);
    }

    @GetMapping(value = "students")
    public List<Student> getStudents() {
        return studentDao.getStudents();
    }

    @PostMapping(value = "student")
    public void createStudent(@RequestBody Student student) {
        studentDao.createStudent(student);
    }

    @DeleteMapping(value = "student/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentDao.deleteStudent(id);
    }

}
