package com.saladin.demo.repositories;

import com.saladin.demo.domains.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> getByDescription(String description);

    Optional<UnitOfMeasure> findByDescription(String each);
}
