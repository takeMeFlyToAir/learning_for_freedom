package com.zzr.head_first.chapter002.observer02;

import java.util.Observable;

/**
 *
 * @author zhaozhirong
 * @date 2022/1/1 10:14 下午
 */

public class WeatherData extends Observable {

    private float temp;

    private float humidity;

    private float pressure;

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setData(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
