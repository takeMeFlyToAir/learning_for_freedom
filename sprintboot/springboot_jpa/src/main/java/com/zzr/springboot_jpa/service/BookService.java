package com.zzr.springboot_jpa.service;

import com.zzr.springboot_jpa.domain.Book;

import java.util.List;

/**
 * @author zhaozhirong
 * @date 2022/2/4 9:56 上午
 */
public interface BookService {

    Integer addBook(Book book);

    List<Book> getAllBooks();

}
