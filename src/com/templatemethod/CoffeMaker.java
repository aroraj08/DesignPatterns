package com.templatemethod;

public class CoffeMaker extends BeverageCaffeine {

    @Override
    public void addMainIngredient() {
        System.out.println("Adding Coffee powder");
    }

    @Override
    public void addCondiments() {
        System.out.println("adding condiments to coffee..");
    }
}
