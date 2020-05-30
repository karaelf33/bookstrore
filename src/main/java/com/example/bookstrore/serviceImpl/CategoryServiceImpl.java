package com.example.bookstrore.serviceImpl;


import com.example.bookstrore.dto.CategoryDto;
import com.example.bookstrore.entities.Category;
import com.example.bookstrore.repositories.CategoryRepository;
import com.example.bookstrore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    public CategoryRepository categoryRepository;

    @Override
    public CategoryDto saveCategory(Category category) {
        Category category=new Category();
        category.setName(category.getName());
        categoryRepository.save(category);
        return category;
    }
}
