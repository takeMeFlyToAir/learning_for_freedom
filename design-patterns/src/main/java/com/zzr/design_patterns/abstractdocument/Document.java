package com.zzr.design_patterns.abstractdocument;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author zhaozhirong
 * @date 2022/1/9 10:15 下午
 */
public interface Document {

    /**
     * put key
     * @param key
     * @param value
     */
    void put(String key, Object value);

    /**
     * get value
     * @param key
     * @return
     */
    Object get(String key);

    /**
     * get children
     * @param key
     * @param constructor
     * @param <T>
     * @return
     */
    <T> Stream<T> children(String key, Function<Map<String, Object>, T> constructor);

}
