package com.zzr.design_patterns.abstractfactory.factory;

/**
 * @author zhaozhirong
 * @date 2022/1/10 8:38 下午
 */
public class FactoryMaker {

    public enum CarType {
        BENZ, AUDI
    }

    public static CarFactory makeFactory(CarType carType) {
        switch (carType) {
            case AUDI:
                return new AudiFactory();
            case BENZ:
                return new BenzFactory();
            default:
                throw new IllegalArgumentException(" CarType not supported ");
        }
    }

}
