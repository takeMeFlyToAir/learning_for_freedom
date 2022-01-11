package com.zzr.head_first.chapter003.component;

/**
 *
 * @author zhaozhirong
 * @date 2022/1/2 10:30 上午
 */

public class DarkRoast extends Beverage{

    public DarkRoast() {
        this.description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 0.66;
    }
}
