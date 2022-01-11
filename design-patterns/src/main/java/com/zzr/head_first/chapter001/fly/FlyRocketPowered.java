package com.zzr.head_first.chapter001.fly;

/**
 * @author zhaozhirong
 * @date 2022/1/1 5:51 下午
 */
public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I’m flying with a rocket!");
    }
}
