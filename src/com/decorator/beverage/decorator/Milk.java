package com.decorator.beverage.decorator;

import com.decorator.Beverage;

public class Milk extends BeverageDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return 0.20 + this.beverage.getCost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " with extra Milk";
    }
}
