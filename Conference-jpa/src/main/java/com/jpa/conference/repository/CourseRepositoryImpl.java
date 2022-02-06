package com.jpa.conference.repository;

import com.jpa.conference.model.Course;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CourseRepositoryImpl implements CourseRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Course save(Course course) {
        entityManager.persist(course);
        return course;
    }
}
