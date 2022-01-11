package com.zzr.head_first.chapter001.duck;


import com.zzr.head_first.chapter001.fly.FlyWithWings;
import com.zzr.head_first.chapter001.quack.Quack;

/**
 * @author zhaozhirong
 * @date 2022/1/1 5:46 下午
 */
public class MallardDuck extends AbstractDuck{


    public MallardDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}
