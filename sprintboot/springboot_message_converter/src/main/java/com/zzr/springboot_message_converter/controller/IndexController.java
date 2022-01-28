package com.zzr.springboot_message_converter.controller;

import com.zzr.springboot_message_converter.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaozhirong
 * @date 2022/1/28 11:06 上午
 */
@RestController
@RequestMapping(value = "/message_converter")
public class IndexController {

    @GetMapping(value = "")
    public Student student() {
        return Student.builder().name("zzr").password("123456").build();
    }

}
