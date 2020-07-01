package com.decorator.beverage;

import com.decorator.Beverage;
import com.decorator.beverage.decorator.Milk;
import com.decorator.beverage.decorator.Mocha;
import com.decorator.beverage.impl.DarkRoast;

public class Main {

    public static void main(String[] args) {

        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription() + " " + beverage.getCost());

        //Beverage beverage1 = new DarkRoast();
        Beverage beverage1 = new Mocha(new DarkRoast());
        System.out.println(beverage1.getDescription() + " " + beverage1.getCost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Milk(beverage2);
        //Beverage beverage2 =  new Milk(new Mocha(new Mocha(new DarkRoast())));

        System.out.println(beverage2.getDescription() + " " + beverage2.getCost());
    }
}
