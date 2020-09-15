package com.hendisantika.booksapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : booksapp
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/09/20
 * Time: 18.13
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private long id;
    private String name;
    private String author;
}
