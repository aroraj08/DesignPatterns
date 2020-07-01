package com.decorator;

public abstract class Beverage {

    private String description;

    public abstract double getCost();

    public String getDescription() {
        return "unknown description";
    }


}
