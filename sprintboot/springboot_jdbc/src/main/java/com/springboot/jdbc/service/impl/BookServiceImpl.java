package com.springboot.jdbc.service.impl;

import com.springboot.jdbc.domain.Book;
import com.springboot.jdbc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhaozhirong
 * @date 2022/2/4 10:03 上午
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer addBook(Book book) {
        jdbcTemplate.update("insert book_inf(title, author, price) values(?,?,?) ", preparedStatement -> {
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setString(2, book.getAuthor());
            preparedStatement.setDouble(3, book.getPrice());
        });
        return book.getId();
    }

    @Override
    public List<Book> getAllBooks() {
        return jdbcTemplate.query("select * from book_inf", new BeanPropertyRowMapper<>(Book.class));
    }
}
