package com.adrianscorus.onlinebookstore.repository;


import com.adrianscorus.onlinebookstore.entities.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "bookCategory",path = "book-category")
public interface CategoryRepository extends JpaRepository<BookCategory,Long> {

}
