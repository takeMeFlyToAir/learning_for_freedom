package com.zzr.head_first.chapter002.observer02;

import com.zzr.head_first.chapter002.observer02.observer.CurrentConditionsDisplay;
import com.zzr.head_first.chapter002.observer02.observer.ForecastDisplay;
import com.zzr.head_first.chapter002.observer02.observer.StatisticsDisplay;

/**
 * @author zhaozhirong
 * @date 2022/1/1 10:28 下午
 */
public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setData(0.1f, 0.1f, 0.1f);
        System.out.println("---------------------");
        weatherData.setData(0.2f, 0.2f, 0.2f);
        System.out.println("---------------------");
        weatherData.setData(0.3f, 0.3f, 0.3f);

    }

}
