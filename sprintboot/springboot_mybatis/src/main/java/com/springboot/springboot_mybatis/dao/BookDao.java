package com.springboot.springboot_mybatis.dao;

import com.springboot.springboot_mybatis.entity.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zhaozhirong
 * @date 2022/2/13 1:42 下午
 */
@Mapper
public interface BookDao {

    @Select("select  * from book_inf")
    List<Book> findAll();

    @Insert("insert book_inf(title, author, price) values(#{title},#{author},#{price})  ")
    Integer insert(Book book);

}
