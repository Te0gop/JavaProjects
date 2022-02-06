package com.jpa.conference.service;


import com.jpa.conference.model.Registration;
import com.jpa.conference.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    @Override
    @Transactional
    public Registration addRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }
}
