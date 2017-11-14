package com.dannyss.spring5_recipe_app.repositories;

import com.dannyss.spring5_recipe_app.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
