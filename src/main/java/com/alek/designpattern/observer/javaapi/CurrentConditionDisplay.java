package com.alek.designpattern.observer.javaapi;

import com.alek.designpattern.observer.Display;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Display, Observer {

    private Weather weather;
    private Observable wheatherData;

    public CurrentConditionDisplay(Observable weatherData) {
        this.wheatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: \ntemperature: " + weather.getTemperature() + "\nhumidity: " + weather.getHumidity());
    }

    @Override
    public void update(Observable observable, Object o) {

        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.weather = weatherData.getWeather();
            display();
        }
    }
}
