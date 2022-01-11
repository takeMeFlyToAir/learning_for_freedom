package com.zzr.head_first.chapter003.component;

/**
 * @author zhaozhirong
 * @date 2022/1/2 10:28 上午
 */
public class Espresso extends Beverage{


    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
