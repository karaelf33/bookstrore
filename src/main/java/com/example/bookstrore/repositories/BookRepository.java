package com.example.bookstrore.repositories;

import com.example.bookstrore.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface BookRepository extends JpaRepository<Book, Long> {

    Book findByName(String name);

}
