package com.jpa.conference.repository;

import com.jpa.conference.model.Registration;
import com.jpa.conference.model.RegistrationReport;

import java.util.List;

public interface RegistrationRepository {
    Registration save(Registration registration);

    List<Registration> findAll();

    List<RegistrationReport> findAllReports();
}
