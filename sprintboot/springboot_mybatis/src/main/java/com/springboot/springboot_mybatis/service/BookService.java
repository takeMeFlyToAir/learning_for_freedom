package com.springboot.springboot_mybatis.service;


import com.springboot.springboot_mybatis.entity.Book;

import java.util.List;

/**
 * @author zhaozhirong
 * @date 2022/2/4 9:56 上午
 */
public interface BookService {

    Integer addBook(Book book);

    List<Book> getAllBooks();

}
