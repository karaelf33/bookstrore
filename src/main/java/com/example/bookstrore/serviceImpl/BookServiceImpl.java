package com.example.bookstrore.serviceImpl;

import com.example.bookstrore.entities.Book;
import com.example.bookstrore.repositories.BookRepository;
import com.example.bookstrore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Optional<Book> getBook(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book getBookName(String name){
        return bookRepository.findByName(name);
    }
}
