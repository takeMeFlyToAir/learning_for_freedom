package com.zzr.springboot_jpa.controller;

import com.zzr.springboot_jpa.domain.Book;
import com.zzr.springboot_jpa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhaozhirong
 * @date 2022/2/4 10:06 上午
 */
@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(value = "")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping
    public Integer addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }


}
