package com.alek.designpatterns.observer.javaapi;

import com.alek.designpatterns.observer.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class WeatherData extends Observable {

    private Weather weather;
    private List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(Weather weather) {
        this.weather = weather;
        measurementsChanged();
    }

    public Weather getWeather() {
        return weather;
    }
}
