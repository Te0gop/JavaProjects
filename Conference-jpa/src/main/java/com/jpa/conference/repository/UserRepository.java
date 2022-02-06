package com.jpa.conference.repository;

import com.jpa.conference.model.User;


public interface UserRepository {
    User save(User user);
}
