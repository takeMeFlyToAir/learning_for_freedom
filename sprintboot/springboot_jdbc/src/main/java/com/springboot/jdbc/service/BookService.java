package com.springboot.jdbc.service;


import com.springboot.jdbc.domain.Book;

import java.util.List;

/**
 * @author zhaozhirong
 * @date 2022/2/4 9:56 上午
 */
public interface BookService {

    Integer addBook(Book book);

    List<Book> getAllBooks();

}
