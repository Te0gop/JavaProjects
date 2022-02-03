package com.rest.conferencedemo.repositories;

import com.rest.conferencedemo.models.Session;

import java.util.List;

public interface SessionCustomJpaRepository {
    List<Session> customGetSessions();
}
