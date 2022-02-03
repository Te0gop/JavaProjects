package com.rest.conferencedemo.repositories;

import com.rest.conferencedemo.models.Session;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class SessionCustomJpaRepositoryImpl implements SessionCustomJpaRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Session> customGetSessions(){
        return entityManager.createQuery("select s from Session s").getResultList();
    }
}
