package com.zzr.head_first.chapter002.observer01.observer;

/**
 * @author zhaozhirong
 * @date 2022/1/1 10:12 下午
 */
public interface Observer {

    void update(float temp, float humidity, float pressure);

}
