package com.example.bookstrore.repositories;

import com.example.bookstrore.entities.BookStoreList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookStoreListRepository extends JpaRepository<BookStoreList,Long> {
}
