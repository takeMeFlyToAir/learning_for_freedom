package com.springboot.springboot_mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @author zhaozhirong
 * @date 2022/2/13 12:42 下午
 */
@Data
@AllArgsConstructor
public class User {

    private String name;

    private Integer age;

    private List<Order> orders;

}
