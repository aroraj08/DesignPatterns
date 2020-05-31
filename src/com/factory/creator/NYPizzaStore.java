package com.factory.creator;

import com.factory.product.NYCheesePizza;
import com.factory.product.NYFarmhousePizza;
import com.factory.product.NYPanPizza;
import com.factory.product.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {

        if ("Cheese".equalsIgnoreCase(type)) {
            return new NYCheesePizza("NY Cheese Pizaa", "wheat", "mayoneese");
        } else if ("Pan".equalsIgnoreCase(type)) {
            return new NYPanPizza("NY Pan Pizza", "wheat", "red");
        } else if ("Farmhouse".equalsIgnoreCase(type)) {
            return new NYFarmhousePizza("NY Farmhouse Pizza", "maida", "white");
        }
        return null;
    }
}
