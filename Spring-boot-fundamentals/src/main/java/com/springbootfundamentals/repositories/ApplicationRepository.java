package com.springbootfundamentals.repositories;

import com.springbootfundamentals.models.Application;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ApplicationRepository extends CrudRepository<Application, Integer> {
    Optional<Application> findById(Integer id);
}
