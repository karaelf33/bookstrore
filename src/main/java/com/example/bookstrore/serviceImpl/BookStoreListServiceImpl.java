package com.example.bookstrore.serviceImpl;

import com.example.bookstrore.entities.Book;
import com.example.bookstrore.entities.BookStoreList;
import com.example.bookstrore.entities.BookStr;
import com.example.bookstrore.repositories.BookStoreListRepository;
import com.example.bookstrore.service.BookService;
import com.example.bookstrore.service.BookStoreListService;
import com.example.bookstrore.service.BookStrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookStoreListServiceImpl implements BookStoreListService {

    @Autowired
    BookService bookService;

    @Autowired
    BookStoreListRepository bookStoreListRepository;

    @Autowired
    BookStrService bookStrService;

    @Override
    public void addBooksToStore(Book book, BookStr bookStr) {
        BookStoreList bookStoreList=new BookStoreList();
        bookStoreList.setBookId(book);
        bookStoreList.setBookStrId(bookStr);
        bookStoreListRepository.save(bookStoreList);
    }
}
