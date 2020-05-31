package com.decorator.beverage.decorator;

import com.decorator.Beverage;

public abstract class BeverageDecorator extends Beverage {

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    protected Beverage beverage;

    public abstract String getDescription();
}
