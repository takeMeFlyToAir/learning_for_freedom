package com.zzr.head_first.chapter001.duck;


import com.zzr.head_first.chapter001.fly.FlyBehavior;
import com.zzr.head_first.chapter001.quack.QuackBehavior;

/**
 * @author zhaozhirong
 * @date 2022/1/1 5:42 下午
 */
public abstract class AbstractDuck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public AbstractDuck(){

    }

    public abstract void display();

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
