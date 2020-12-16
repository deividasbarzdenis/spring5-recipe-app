package com.debarz.spring5recipeapp.services;

import com.debarz.spring5recipeapp.commands.RecipeCommand;
import com.debarz.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand testRecipeCommand);

    Object findCommandById(Long anyLong);

    void deleteById(Long idToDelete);
}
