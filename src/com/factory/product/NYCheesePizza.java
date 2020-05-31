package com.factory.product;

import java.util.ArrayList;
import java.util.Arrays;

public class NYCheesePizza extends Pizza {

    public NYCheesePizza(String name, String dough, String sauce) {
        super(name, dough, sauce);
        this.setToppingList(Arrays.asList("topping 1", "topping 2"));
    }

    @Override
    public void cut() {
        System.out.println("Special cut");
    }
}
