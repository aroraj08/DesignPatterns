package com.observer;

import com.observer.observable.WeatherData;
import com.observer.observers.Display1Observer;
import com.observer.observers.Display2Observer;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(75, new BigDecimal("78"), 15);

        Display1Observer observer1 = new Display1Observer(weatherData);
        Display2Observer observer2 = new Display2Observer(weatherData);

        weatherData.measurementChanged();

        observer1.display();
        observer2.display();

        weatherData.setWeatherData(80, new BigDecimal("80"), 13);
        weatherData.measurementChanged();

        observer1.display();
        observer2.display();

        observer1.removeObserver(weatherData);

    }
}
