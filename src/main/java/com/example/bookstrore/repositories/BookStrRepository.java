package com.example.bookstrore.repositories;

import com.example.bookstrore.entities.BookStr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookStrRepository extends JpaRepository<BookStr,Long> {
}
