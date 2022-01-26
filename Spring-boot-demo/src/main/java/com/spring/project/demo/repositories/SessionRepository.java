package com.spring.project.demo.repositories;

import com.spring.project.demo.models.Sessions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Sessions, Long> {

}
