package com.observer.observable;

import java.math.BigDecimal;
import java.util.Observable;

public class WeatherData extends Observable {

    private int humidity;
    private BigDecimal temperature;
    private int pressure;

    public WeatherData(int humidity, BigDecimal temperature, int pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public void setWeatherData(int humidity, BigDecimal temperature, int pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;
    }

    public void measurementChanged() {
        this.setChanged();
        this.notifyObservers();
    }

    public int getHumidity() {
        return humidity;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }

}
