package com.example.bookstrore.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "BOOK")
@Getter
@Setter
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String id;

    @Column(name = "BOOK_NAME")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @Column(name = "BOOK_CATEGORY")
    private Category category;

    @Column(name = "PRICE")
    private int price;
}
