package com.jpa.conference.repository;

import com.jpa.conference.model.Registration;
import com.jpa.conference.model.RegistrationReport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RegistrationRepositoryImpl implements RegistrationRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Registration save(Registration registration) {
        entityManager.persist(registration);
        return registration;
    }

    @Override
    public List<Registration> findAll() {
        List<Registration> registrations =
                entityManager.createQuery("Select r from Registration r").getResultList();
        return registrations;
    }

    @Override
    public List<RegistrationReport> findAllReports() {
        String jpql = "Select new com.jpa.conference.model.RegistrationReport" +
                "(r.name, c.name, c.description) from Registration r";

        List<RegistrationReport> registrationReports =
                entityManager.createQuery(jpql).getResultList();
        return registrationReports;
    }
}
