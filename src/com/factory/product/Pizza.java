package com.factory.product;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String dough;
    String name;
    String sauce;
    private List<String> toppingList = new ArrayList<>();

    public Pizza(String name, String dough, String sauce) {
        this.dough = dough;
        this.name = name;
        this.sauce = sauce;
    }

    public List<String> getToppingList() {
        return toppingList;
    }

    public void setToppingList(List<String> toppingList) {
        this.toppingList = toppingList;
    }

    public void prepare() {
        System.out.println("Preparing pizza :" + name + " with dough : " + dough + " and sauce : " + sauce);
        System.out.println("Toppings -> ");
        toppingList.forEach(c  -> System.out.println(c));
    }

    public void bake() {
        System.out.println("Baking pizza");
    }

    public void cut() {
        System.out.println("Cutting Pizaa");
    }

    public void box() {
        System.out.println("Boxing Pizza");
    }
}
