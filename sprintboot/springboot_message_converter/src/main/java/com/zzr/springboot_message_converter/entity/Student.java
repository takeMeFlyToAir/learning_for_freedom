package com.zzr.springboot_message_converter.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author zhaozhirong
 * @date 2022/1/28 11:06 上午
 */
@Data
@Builder
public class Student {

    private String name;

    private transient String password;
}
