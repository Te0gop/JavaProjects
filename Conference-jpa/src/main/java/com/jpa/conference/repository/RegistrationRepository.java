package com.jpa.conference.repository;

import com.jpa.conference.model.Registration;

public interface RegistrationRepository {
    Registration save(Registration registration);
}
