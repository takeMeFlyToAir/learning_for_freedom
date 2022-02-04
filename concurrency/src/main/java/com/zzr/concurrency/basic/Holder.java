package com.zzr.concurrency.basic;

import java.util.Collection;
import java.util.Collections;

/**
 * @author zhaozhirong
 * @date 2022/1/29 3:39 下午
 */
public class Holder {

    private final int value;


    public Holder(int value){
        this.value = value;
    }


    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Holder holder = new Holder(1);

    }
}
