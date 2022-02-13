package com.springboot.springboot_mybatis.service.impl;

import com.springboot.springboot_mybatis.dao.BookDao;
import com.springboot.springboot_mybatis.entity.Book;
import com.springboot.springboot_mybatis.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaozhirong
 * @date 2022/2/4 10:03 上午
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public Integer addBook(Book book) {
        bookDao.insert(book);
        return book.getId();
    }

    @Override
    public List<Book> getAllBooks() {
        return bookDao.findAll();
    }
}
