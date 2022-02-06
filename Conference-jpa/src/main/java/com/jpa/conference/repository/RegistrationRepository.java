package com.jpa.conference.repository;

import com.jpa.conference.model.Registration;
import com.jpa.conference.model.RegistrationReport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
    List<RegistrationReport> registrationReport();
}
