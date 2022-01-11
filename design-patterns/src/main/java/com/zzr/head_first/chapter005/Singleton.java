package com.zzr.head_first.chapter005;

/**
 * @author zhaozhirong
 * @date 2022/1/3 9:36 上午
 */
public class Singleton {

    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


}
