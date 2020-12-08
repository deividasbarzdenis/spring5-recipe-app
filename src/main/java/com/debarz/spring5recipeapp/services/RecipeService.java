package com.debarz.spring5recipeapp.services;

import com.debarz.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
