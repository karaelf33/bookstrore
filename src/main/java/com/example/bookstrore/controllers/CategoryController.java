package com.example.bookstrore.controllers;


import com.example.bookstrore.entities.Category;
import com.example.bookstrore.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController {

    final static Logger logger = LoggerFactory.getLogger(CategoryController.class);

    @Autowired
    CategoryService categoryService;


    @RequestMapping("/getAllCategory")
    public List<Category> getAllCategory(){
        return categoryService.getAllCategory();
    }

    @RequestMapping("/category/{id}")
    public Optional<Category> getCategory(@PathVariable Long id){
        return categoryService.getCategory(id);
    }


    @RequestMapping(value = "/saveCategory", method = RequestMethod.POST)
    public void saveCategory(@RequestBody Category category) {
        categoryService.saveCategory(category);
    }

    @RequestMapping(value = "/updateCategory/{id}", method = RequestMethod.PUT)
    public void updateCategory(@RequestBody Category category,@PathVariable Long id) {
        categoryService.updateCategory(id,category);
    }
    @RequestMapping(method = RequestMethod.DELETE,  value = "/deleteCategory/{id}")
    public void deleteCategory(@PathVariable Long id){
        categoryService.deleteCategory(id);
    }
}
