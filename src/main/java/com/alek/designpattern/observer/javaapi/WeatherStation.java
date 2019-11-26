package com.alek.designpattern.observer.javaapi;


public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(new Weather(40,54,21.5f));
        weatherData.setMeasurements(new Weather(41,53,22.5f));
        weatherData.setMeasurements(new Weather(42,55,23.5f));

    }
}
