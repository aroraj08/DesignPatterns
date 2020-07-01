package com.observer.observers;

import java.math.BigDecimal;

public class DisplayData {

    private int humidity;
    private BigDecimal temperature;
    private int pressure;

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "DisplayData{" +
                "humidity=" + humidity +
                ", temperature=" + temperature +
                ", pressure=" + pressure +
                '}';
    }
}
