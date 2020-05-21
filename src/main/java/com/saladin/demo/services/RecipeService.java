package com.saladin.demo.services;

import com.saladin.demo.domains.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
