package com.decorator.beverage.impl;

import com.decorator.Beverage;

public class DarkRoast extends Beverage {

    @Override
    public String getDescription() {
        return "Dark Roast Coffee";
    }

    @Override
    public double getCost() {
        return 10.0;
    }

}
