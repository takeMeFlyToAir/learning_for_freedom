package com.zzr.head_first.chapter003.component;

/**
 * @author zhaozhirong
 * @date 2022/1/2 10:29 上午
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        this.description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
