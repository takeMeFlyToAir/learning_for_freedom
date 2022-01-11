package com.zzr.head_first.chapter003.decorator;


import com.zzr.head_first.chapter003.component.Beverage;

/**
 * @author zhaozhirong
 * @date 2022/1/2 10:31 上午
 */
public class Mocha extends Condiment{

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
