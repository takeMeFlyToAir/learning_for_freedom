package com.zzr.head_first.chapter003.decorator;

import com.zzr.head_first.chapter003.component.Beverage;

/**
 * @author zhaozhirong
 * @date 2022/1/2 10:31 上午
 */
public class Whip extends Condiment{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.30 + beverage.cost();
    }
}
