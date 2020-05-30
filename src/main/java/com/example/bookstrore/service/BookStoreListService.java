package com.example.bookstrore.service;

import com.example.bookstrore.entities.Book;
import com.example.bookstrore.entities.BookStoreList;
import com.example.bookstrore.entities.BookStr;

public interface BookStoreListService {
    void addBooksToStore(Book book, BookStr bookStr);
}
