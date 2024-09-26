package com.colak.springtutorial.repository;

import com.colak.springtutorial.jpa.Author;
import com.colak.springtutorial.jpa.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * This repository uses EntityManager API to solve N+1 Select Problem
 */
@Repository
@RequiredArgsConstructor
public class BookRepository {

    private final EntityManager entityManager;

    public List<Book> findAll() {
        TypedQuery<Book> typedQuery = entityManager.createQuery("select b from Book b", Book.class);
        return typedQuery.getResultList();
    }

}
