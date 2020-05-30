package com.example.bookstrore.controllers;


import com.example.bookstrore.entities.Book;
import com.example.bookstrore.entities.BookStoreList;
import com.example.bookstrore.entities.BookStr;
import com.example.bookstrore.service.BookStoreListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookStoreListController {

    @Autowired
    private BookStoreListService bookStoreListService;


    @RequestMapping(value = "/addBooksToStore",method = RequestMethod.POST)
    public void addBooksToStore(@RequestBody Book book, BookStr bookStr){
        bookStoreListService.addBooksToStore(book,bookStr);

    }
}
