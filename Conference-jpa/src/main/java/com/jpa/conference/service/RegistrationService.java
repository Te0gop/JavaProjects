package com.jpa.conference.service;

import com.jpa.conference.model.Registration;

import javax.transaction.Transactional;
import java.util.List;

public interface RegistrationService {
    
    @Transactional
    Registration addRegistration(Registration registration);

    List<Registration> findAll();
}
