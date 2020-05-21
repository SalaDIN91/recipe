package com.saladin.demo.repositories;

import com.saladin.demo.domains.Category;
import com.saladin.demo.domains.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
