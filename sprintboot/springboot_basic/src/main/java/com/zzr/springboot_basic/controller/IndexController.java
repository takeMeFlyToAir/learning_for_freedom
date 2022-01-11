package com.zzr.springboot_basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaozhirong
 * @date 2022/1/9 7:06 下午
 */
@RestController
@RequestMapping(value = "/index")
public class IndexController {

    @GetMapping(value = "")
    public String index(){
        return "index";
    }

}
