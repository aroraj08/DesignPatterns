package com.observer.observers;

import com.observer.observable.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class Display1Observer implements Observer, Display {

    Observable observable;

    public Display1Observer(Observable observable) {
            this.observable = observable;
            this.observable.addObserver(this);
    }

    DisplayData data;

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            data = new DisplayData();
            data.setHumidity(weatherData.getHumidity());
            data.setPressure(weatherData.getPressure());
            data.setTemperature(weatherData.getTemperature());
        }
    }

    @Override
    public void display() {
        System.out.println("Display 1: " + this.data.getHumidity() + " " + this.data.getPressure());
    }

    public void removeObserver(Observable observable) {
        observable.deleteObserver(this);
    }
}
