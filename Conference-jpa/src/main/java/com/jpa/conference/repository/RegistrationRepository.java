package com.jpa.conference.repository;

import com.jpa.conference.model.Registration;

import java.util.List;

public interface RegistrationRepository {
    Registration save(Registration registration);

    List<Registration> findAll();
}
