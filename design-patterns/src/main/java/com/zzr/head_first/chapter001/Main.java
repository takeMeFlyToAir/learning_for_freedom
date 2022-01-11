package com.zzr.head_first.chapter001;


import com.zzr.head_first.chapter001.duck.MallardDuck;
import com.zzr.head_first.chapter001.duck.ModelDuck;
import com.zzr.head_first.chapter001.fly.FlyRocketPowered;

/**
 * @author zhaozhirong
 * @date 2022/1/1 5:36 下午
 */
public class Main {

    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

    }

}
