package com.zzr.head_first.chapter003.decorator;

import com.zzr.head_first.chapter003.component.Beverage;

/**
 * @author zhaozhirong
 * @date 2022/1/2 10:26 上午
 */
public abstract class Condiment extends Beverage {

    protected Beverage beverage;

    @Override
    public abstract String getDescription();

}
