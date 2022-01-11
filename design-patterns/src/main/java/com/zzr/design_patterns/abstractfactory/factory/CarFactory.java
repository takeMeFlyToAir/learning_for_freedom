package com.zzr.design_patterns.abstractfactory.factory;

import com.zzr.design_patterns.abstractfactory.Car;
import com.zzr.design_patterns.abstractfactory.Engine;
import com.zzr.design_patterns.abstractfactory.Wheel;

/**
 * @author zhaozhirong
 * @date 2022/1/10 8:33 下午
 */

public interface CarFactory {

    Car createCar();

    Engine createEngine();

    Wheel createWheel();

}
