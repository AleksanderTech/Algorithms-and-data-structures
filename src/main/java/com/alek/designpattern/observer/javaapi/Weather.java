package com.alek.designpattern.observer.javaapi;

public class Weather {

    private float temperature;
    private float humidity;
    private float barometricPressure;

    public Weather(float temperature, float humidity, float barometricPressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.barometricPressure = barometricPressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getBarometricPressure() {
        return barometricPressure;
    }

    public void setBarometricPressure(float barometricPressure) {
        this.barometricPressure = barometricPressure;
    }
}
