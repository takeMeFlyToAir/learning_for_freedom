package com.springboot.springboot_mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author zhaozhirong
 * @date 2022/2/13 12:41 下午
 */
@Data
@AllArgsConstructor
public class Order {

    private String orderNo;

    private String goodsName;

}
