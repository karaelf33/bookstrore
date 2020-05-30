package com.example.bookstrore.serviceImpl;


import com.example.bookstrore.entities.Category;
import com.example.bookstrore.repositories.CategoryRepository;
import com.example.bookstrore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    public CategoryRepository categoryRepository;

    @Override
    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> getCategory(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public void updateCategory(Long id, Category category) {

            Optional<Category> c=categoryRepository.findById(id);
//         c.set
    }

    @Override
    public void deleteCategory(Long id) {
         categoryRepository.deleteById(id);
    }
}

