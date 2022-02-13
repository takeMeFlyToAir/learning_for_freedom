package com.springboot.springboot_mybatis.mybatis;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

/**
 * @author zhaozhirong
 * @date 2022/2/13 1:51 下午
 */
public class CustomObjectFactory extends DefaultObjectFactory {

    @Override
    public <T> T create(Class<T> type) {
        return super.create(type);
    }
}
