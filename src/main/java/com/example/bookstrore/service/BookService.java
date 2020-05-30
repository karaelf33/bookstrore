package com.example.bookstrore.service;

import com.example.bookstrore.entities.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

     List<Book> getAllBook();

    void addBook(Book book);

    Optional<Book> getBook(Long id);

    public Book getBookName(String name);
}
