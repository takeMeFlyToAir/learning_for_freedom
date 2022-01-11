package com.zzr.design_patterns.abstractfactory;

import com.zzr.PrintLogger;
import com.zzr.design_patterns.abstractfactory.factory.BenzFactory;
import com.zzr.design_patterns.abstractfactory.factory.CarFactory;
import com.zzr.design_patterns.abstractfactory.factory.FactoryMaker;

/**
 * @author zhaozhirong
 * @date 2022/1/10 8:36 下午
 */
public class App {

    public static void main(String[] args) {
        CarFactory carFactory = new BenzFactory();
        PrintLogger.info(carFactory.createCar().getName());
        PrintLogger.info(carFactory.createEngine().getName());
        PrintLogger.info(carFactory.createWheel().getName());

        carFactory = FactoryMaker.makeFactory(FactoryMaker.CarType.AUDI);
        PrintLogger.info(carFactory.createCar().getName());
        PrintLogger.info(carFactory.createEngine().getName());
        PrintLogger.info(carFactory.createWheel().getName());
    }

}
