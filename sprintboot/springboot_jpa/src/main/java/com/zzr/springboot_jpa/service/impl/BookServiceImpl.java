package com.zzr.springboot_jpa.service.impl;

import com.zzr.springboot_jpa.dao.BookDao;
import com.zzr.springboot_jpa.domain.Book;
import com.zzr.springboot_jpa.service.BookService;
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
        bookDao.save(book);
        return book.getId();
    }

    @Override
    public List<Book> getAllBooks() {
        return (List<Book>) bookDao.findAll();
    }
}
