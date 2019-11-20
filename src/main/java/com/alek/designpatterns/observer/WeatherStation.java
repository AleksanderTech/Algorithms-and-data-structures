package com.alek.designpatterns.observer;

public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(40,55,22.2f);
        weatherData.setMeasurements(42,56,21.2f);
        weatherData.setMeasurements(43,52,23.2f);
    }
}
