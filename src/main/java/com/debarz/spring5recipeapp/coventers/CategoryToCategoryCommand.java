package com.debarz.spring5recipeapp.coventers;

import com.debarz.spring5recipeapp.commands.CategoryCommand;
import com.debarz.spring5recipeapp.domain.Category;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class CategoryToCategoryCommand implements Converter<Category, CategoryCommand> {

    @Synchronized
    @Nullable
    @Override
    public CategoryCommand convert(Category source) {
        if(source == null){
            return null;
        }
        final CategoryCommand category = new CategoryCommand();
        category.setId(source.getId());
        category.setDescription(source.getDescription());
        return category;
    }
}
