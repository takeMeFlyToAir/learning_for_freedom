package com.zzr.head_first.chapter002.observer02.observer;

import com.zzr.head_first.chapter002.observer02.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zhaozhirong
 * @date 2022/1/1 10:23 下午
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Observable weatherData;


    public ForecastDisplay(Observable subject){
        this.weatherData = subject;
        this.weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            this.temperature = ((WeatherData) o).getTemp();
            this.humidity = ((WeatherData) o).getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("forecast conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

}
