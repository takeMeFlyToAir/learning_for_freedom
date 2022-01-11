package com.zzr.head_first.chapter003;

import com.zzr.head_first.chapter003.component.Beverage;
import com.zzr.head_first.chapter003.component.DarkRoast;
import com.zzr.head_first.chapter003.decorator.Mocha;
import com.zzr.head_first.chapter003.decorator.Soy;

/**
 * @author zhaozhirong
 * @date 2022/1/2 10:33 上午
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Soy(darkRoast);
        System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());
    }

}
