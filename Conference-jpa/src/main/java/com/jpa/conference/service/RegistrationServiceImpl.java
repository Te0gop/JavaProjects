package com.jpa.conference.service;


import com.jpa.conference.model.Course;
import com.jpa.conference.model.Registration;
import com.jpa.conference.model.RegistrationReport;
import com.jpa.conference.repository.CourseRepository;
import com.jpa.conference.repository.CourseRepositoryImpl;
import com.jpa.conference.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;
    @Autowired
    private CourseRepository courseRepository;

    @Override
    @Transactional
    public Registration addRegistration(Registration registration) {

        if(registration.getId() == null) {
            Course course = new Course();
            course.setName("Intro");
            course.setDescription("Intro");
            course.setRegistration(registration);
            courseRepository.save(course);
        }
        return registration;

    }

    @Override
    public List<Registration> findAll() {
        return registrationRepository.findAll();
    }

    @Override
    public List<RegistrationReport> findAllReports() {
        return registrationRepository.registrationReport();
    }
}
