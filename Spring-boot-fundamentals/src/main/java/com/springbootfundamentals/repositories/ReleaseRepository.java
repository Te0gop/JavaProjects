package com.springbootfundamentals.repositories;

import com.springbootfundamentals.models.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}
