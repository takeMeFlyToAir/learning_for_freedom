package com.zzr.design_patterns.builder;

import com.zzr.PrintLogger;

/**
 * @author zhaozhirong
 * @date 2022/1/10 8:51 下午
 */
public class App {


    public static void main(String[] args) {
        User.Builder builder = new User.Builder("zzr", "132").withAddress("zhangbusi");
        User user = new User(builder);
        PrintLogger.info(user.toString());
        user = builder.build();
        PrintLogger.info(user.toString());

    }

}
