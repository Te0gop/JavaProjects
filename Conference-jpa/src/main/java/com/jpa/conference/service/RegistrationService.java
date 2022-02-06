package com.jpa.conference.service;

import com.jpa.conference.model.Registration;

import javax.transaction.Transactional;

public interface RegistrationService {

    @Transactional
    Registration addRegistration(Registration registration);
}
