package com.factory.creator;

import com.factory.product.*;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {

        if ("Cheese".equalsIgnoreCase(type)) {
            return new CaliforinaCheesePizza("CA Cheese Pizaa", "wheat", "mayoneese");
        } else if ("Pan".equalsIgnoreCase(type)) {
            return new CaliforniaPanPizza("CA Pan Pizza", "wheat", "red");
        }
        return null;
    }
}
