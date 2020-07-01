package com.templatemethod;

public abstract class BeverageCaffeine {

    public final void prepareBeverage() {
        boilWater();
        addMainIngredient();
        brewBeverage();
        if (isCondimentToAdd()) {  // this works as a hook..
            addCondiments();
        }
    }

    public boolean isCondimentToAdd() {
        return true;
    }

    protected void boilWater() {
        System.out.println("Boiling water..");
    }

    protected void brewBeverage() {
        System.out.println("Brewing average..");
    }

    protected abstract void addMainIngredient();

    protected abstract void addCondiments();
}
