package com.zzr.head_first.chapter003.component;

/**
 * @author zhaozhirong
 * @date 2022/1/2 10:31 上午
 */
public class Decaf extends Beverage{

    public Decaf() {
        this.description = "Decaf";
    }

    @Override
    public double cost() {
        return 0.77;
    }
}
