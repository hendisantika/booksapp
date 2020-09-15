package com.hendisantika.booksapp.controller;

import com.hendisantika.booksapp.domain.Book;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

/**
 * Created by IntelliJ IDEA.
 * Project : booksapp
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/09/20
 * Time: 18.17
 */

@RestController
@RequestMapping("/books")
public class BooksController {
    private static final Book[] books = {
            new Book(1L, "Harry Potter", "JK. Rowling"),
            new Book(2L, "Great Expectations", "Charles Dickens"),
            new Book(3L, "The Chronicles of Narnia", "C.S. Lewis")
    };

    @GetMapping
    public Book[] books() {
        return books;
    }

    @GetMapping("/{id}")
    public Book book(@PathVariable int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }

        }
        throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Entity not found"
        );
    }
}
