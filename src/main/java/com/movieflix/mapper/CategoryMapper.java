package com.movieflix.mapper;

import com.movieflix.entity.Category;
import com.movieflix.request.CategoryRequest;
import com.movieflix.response.CategoryResponse;

public class CategoryMapper {
    public static Category toCategory(CategoryRequest categoryRequest) {
        return new Category(null, categoryRequest.name());
    }

    public static CategoryResponse toCategoryResponse(Category category) {
        return new CategoryResponse(category.getId(), category.getName());
    }
}
