package com.example.bookstrore.service;

import com.example.bookstrore.entities.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    void saveCategory(Category category);

    List<Category> getAllCategory();

    Optional<Category> getCategory(Long id);

    void updateCategory(Long id, Category category);

    void deleteCategory(Long id);
}
