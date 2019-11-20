package com.alek.designpatterns.observer;

public class CurrentConditionDisplay implements Display, Observer {

    private float temperature;
    private float humidity;
    private Subject WheatherData;

    public CurrentConditionDisplay(Subject wheatherData) {
        WheatherData = wheatherData;
        wheatherData.register(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: \ntemperature: " + temperature + "\nhumidity: " + humidity);
    }
}
