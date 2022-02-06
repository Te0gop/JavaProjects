package com.jpa.conference.repository;

import com.jpa.conference.model.Course;

public interface CourseRepository {
    Course save(Course course);
}
