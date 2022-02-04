package com.zzr.springboot_jpa.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author zhaozhirong
 * @date 2022/2/4 9:52 上午
 */
@Entity
@Table(name = "book_inf")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String author;

    private Double price;


}
