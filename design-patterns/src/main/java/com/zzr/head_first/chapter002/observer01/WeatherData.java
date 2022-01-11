package com.zzr.head_first.chapter002.observer01;

import com.zzr.head_first.chapter002.observer01.observer.Observer;

import java.util.ArrayList;

/**
 *
 * @author zhaozhirong
 * @date 2022/1/1 10:14 下午
 */

public class WeatherData implements Subject{

    private float temp;

    private float humidity;

    private float pressure;

    private ArrayList<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(item -> item.update(temp, humidity, pressure));
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setData(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
