package com.zzr.springboot_jpa.dao;

import com.zzr.springboot_jpa.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author zhaozhirong
 * @date 2022/2/4 9:55 上午
 */
public interface BookDao extends CrudRepository<Book, Integer> {

}
