package com.example.bookstrore.serviceImpl;

import com.example.bookstrore.entities.BookStr;
import com.example.bookstrore.repositories.BookStrRepository;
import com.example.bookstrore.service.BookStrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookStrServiceImpl implements BookStrService {

    @Autowired
    BookStrRepository bookStrRepository;

    @Override
    public Optional<BookStr> getBookStr(Long id) {
        return bookStrRepository.findById(id);
    }
}
