package com.zzr.springboot_basic.config;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author zhaozhirong
 * @date 2022/2/5 9:16 上午
 */
@Data
public class FkJava {

    private String name;
    private Integer age;
    private List<String> servers;

    private FkJava(String name, Integer age, List<String> servers) {
        this.name = name;
        this.age = age;
        this.servers = servers;
    }

    public static FkJava fromMap(Map<String, Object> map) {
        Map<String, Object> fkjava = (Map<String, Object>) map.get("fkjava");
        String name = (String) fkjava.get("name");
        Integer age = (Integer) fkjava.get("age");
        List<String> servers = (List<String>) fkjava.get("servers");
        return new FkJava(name, age, servers);
    }
}
