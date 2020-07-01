package com.observer.observers;

import com.observer.observable.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class Display2Observer implements Observer, Display {

    public Display2Observer(Observable observable) {
        observable.addObserver(this);
    }

    DisplayData data;

    @Override
    public void display() {
        System.out.println("Display 2: " + this.data.getHumidity() + " " + this.data.getPressure()
                + " " + this.data.getTemperature().toString());
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            this.data = new DisplayData();
            WeatherData weatherData = (WeatherData) o;
            data.setHumidity(weatherData.getHumidity());
            data.setPressure(weatherData.getPressure());
            data.setTemperature(weatherData.getTemperature());
        }
    }

    public void removeObserver(Observable observable) {
        observable.deleteObserver(this);
    }
}
