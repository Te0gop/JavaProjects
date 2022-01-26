package com.spring.project.demo.repositories;

import com.spring.project.demo.models.Speakers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speakers, Integer> {
}
