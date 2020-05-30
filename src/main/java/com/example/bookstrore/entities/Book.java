package com.example.bookstrore.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "BOOK")
@Getter
@Setter
@ToString
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "BOOK_NAME")
    private String name;

    @OneToOne
    @JoinColumn(name = "BOOK_CATEGORY_ID")
    private Category category;

    @Column(name = "PRICE")
    private int price;
}
