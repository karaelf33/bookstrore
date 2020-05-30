package com.example.bookstrore.service;

import com.example.bookstrore.entities.BookStr;

import java.util.Optional;

public interface BookStrService {
    Optional<BookStr> getBookStr(Long id);
}
