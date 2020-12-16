package com.debarz.spring5recipeapp.services;

import com.debarz.spring5recipeapp.commands.RecipeCommand;
import com.debarz.spring5recipeapp.domain.Recipe;

import java.util.Set;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
