package com.example.bookstrore.controllers;


import com.example.bookstrore.dto.GenericDto;
import com.example.bookstrore.entities.Category;
import com.example.bookstrore.service.CategoryService;
import com.example.bookstrore.util.ApiPaths;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = ApiPaths.CategoryCtrl.CTRL + "/category")
public class CategoryController {

    final static Logger logger = LoggerFactory.getLogger(CategoryController.class);
    private CategoryService categoryService;


    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public GenericDto saveCategory(Category category) {
        try {
            logger.info("[CATEGORY_CONTROLLER][ADD_CATEGORY_CONTACT]");
            categoryService.saveCategory(category);

        } catch (Exception e) {
            logger.error("[CATEGORY_CONTROLLER][ERROR]", e);
        }
        return null;
    }
}
