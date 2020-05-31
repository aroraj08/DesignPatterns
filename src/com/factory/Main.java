package com.factory;

import com.factory.creator.CaliforniaPizzaStore;
import com.factory.creator.NYPizzaStore;
import com.factory.creator.PizzaStore;
import com.factory.product.Pizza;

public class Main {

    public static void main(String[] args) {

        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("Cheese");

        PizzaStore pizzaStore1 = new CaliforniaPizzaStore();
        pizzaStore1.orderPizza("Pan");

    }
}
