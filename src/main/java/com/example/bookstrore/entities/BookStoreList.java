package com.example.bookstrore.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "BOOK_STORE_LIST")
@Getter
@Setter
public class BookStoreList {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;


    @JoinColumn(name = "BOOK_ID")
    @ManyToMany(cascade=CascadeType.ALL)
    private Book bookId;

    @Column(name = "BOOK_STR_ID")
    @ManyToMany(cascade=CascadeType.ALL)
    private BookStr bookStrId;

    @Column(name = "PRICE")
    private int price;

}
