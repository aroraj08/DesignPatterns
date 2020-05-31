package com.decorator.beverage.decorator;

import com.decorator.Beverage;

public class Mocha extends BeverageDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return 0.10 + this.beverage.getCost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + " with Mocha";
    }
}
