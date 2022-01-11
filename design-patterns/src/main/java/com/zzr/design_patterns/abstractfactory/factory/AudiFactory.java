package com.zzr.design_patterns.abstractfactory.factory;

import com.zzr.design_patterns.abstractfactory.*;

/**
 * @author zhaozhirong
 * @date 2022/1/10 8:35 下午
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new AudiCar();
    }

    @Override
    public Engine createEngine() {
        return new AudiEngine();
    }

    @Override
    public Wheel createWheel() {
        return new AudiWheel();
    }
}
