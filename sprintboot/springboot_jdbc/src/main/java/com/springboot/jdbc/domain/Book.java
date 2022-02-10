package com.springboot.jdbc.domain;

import lombok.Data;

/**
 * @author zhaozhirong
 * @date 2022/2/4 9:52 上午
 */
@Data
public class Book {

    private Integer id;

    private String title;

    private String author;

    private Double price;


}
