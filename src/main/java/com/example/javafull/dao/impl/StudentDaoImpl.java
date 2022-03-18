package com.example.javafull.dao.impl;

import com.example.javafull.dao.StudentDao;
import com.example.javafull.models.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Student getStudent(Long id) {
        String query = "FROM Student WHERE id = :id";
        List<Student> studentList = entityManager.createQuery(query)
                .setParameter("id", id)
                .getResultList();
        return studentList.get(0) != null ? studentList.get(0) : null;
    }

    @Override
    public List<Student> getStudents() {
        String query = "FROM Student";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void deleteStudent(Long id) {
        Student student = entityManager.find(Student.class,id);
        entityManager.remove(student);
    }

    @Override
    public void createStudent(Student student) {
       entityManager.merge(student);
    }


}
