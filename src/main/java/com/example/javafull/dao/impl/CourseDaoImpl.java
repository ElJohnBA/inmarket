package com.example.javafull.dao.impl;

import com.example.javafull.dao.CourseDao;
import com.example.javafull.models.Course;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class CourseDaoImpl implements CourseDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Course getCourse(Long code) {
        String query = "FROM Course WHERE id = :code";
        List<Course> courseList = entityManager.createQuery(query)
                .setParameter("code", code)
                .getResultList();
        return courseList.get(0) != null ? courseList.get(0) : null;
    }

    @Override
    public List<Course> getCourses() {
        String query = "FROM Course";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public void deleteCourse(Long code) {
        Course course = entityManager.find(Course.class,code);
        entityManager.remove(course);
    }

    @Override
    public void createCourse(Course course) {
       entityManager.merge(course);
    }


}
