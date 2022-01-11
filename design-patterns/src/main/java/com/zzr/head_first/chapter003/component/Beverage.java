package com.zzr.head_first.chapter003.component;

/**
 * @author zhaozhirong
 * @date 2022/1/2 10:23 上午
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";


    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
