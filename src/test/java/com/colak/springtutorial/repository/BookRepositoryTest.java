package com.colak.springtutorial.repository;

import com.colak.springtutorial.jpa.Author;
import com.colak.springtutorial.jpa.Book;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Slf4j
class BookRepositoryTest {

    @Autowired
    private BookRepository repository;

    @Test
    @Transactional
    void findByAll() {
        List<Book> list = repository.findAll();
        for (Book book : list) {
            Author author = book.getAuthor();
            log.info("Author name : {} Book title : {} ", author.getName(), book.getTitle());

        }
    }
}
