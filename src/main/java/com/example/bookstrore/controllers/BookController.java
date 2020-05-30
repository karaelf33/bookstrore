package com.example.bookstrore.controllers;

import com.example.bookstrore.entities.Book;
import com.example.bookstrore.entities.Category;
import com.example.bookstrore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/allBooks")
    public List<Book> getAllBooks(){
        return bookService.getAllBook();
    }

    @RequestMapping("/book/{id}")
    public Optional<Book> getBook(@PathVariable Long id){
        return bookService.getBook(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/books")
    public void addBook(@RequestBody  Book book){
        bookService.addBook(book);
    }
}
