package com.spring.project.demo.repositories;

import com.spring.project.demo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
