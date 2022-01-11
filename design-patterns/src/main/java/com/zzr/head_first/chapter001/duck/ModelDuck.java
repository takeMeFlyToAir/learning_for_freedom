package com.zzr.head_first.chapter001.duck;


import com.zzr.head_first.chapter001.fly.FlyWithNoWay;
import com.zzr.head_first.chapter001.quack.MuteQuack;

/**
 * @author zhaozhirong
 * @date 2022/1/1 5:47 下午
 */
public class ModelDuck extends AbstractDuck{

    public ModelDuck(){
        this.flyBehavior = new FlyWithNoWay();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I’m a model duck");
    }
}
