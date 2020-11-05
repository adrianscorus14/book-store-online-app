package com.adrianscorus.onlinebookstore.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "table_category")
public class BookCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
    private Set<Book> book;
}
