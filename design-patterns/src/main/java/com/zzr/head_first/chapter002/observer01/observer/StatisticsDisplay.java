package com.zzr.head_first.chapter002.observer01.observer;

import com.zzr.head_first.chapter002.observer01.Subject;

/**
 * @author zhaozhirong
 * @date 2022/1/1 10:23 下午
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;


    public StatisticsDisplay(Subject subject){
        this.weatherData = subject;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("statistics conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

}
