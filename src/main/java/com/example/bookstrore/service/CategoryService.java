package com.example.bookstrore.service;

import com.example.bookstrore.dto.CategoryDto;
import com.example.bookstrore.entities.Category;

public interface CategoryService {

    CategoryDto saveCategory(Category category);
}
