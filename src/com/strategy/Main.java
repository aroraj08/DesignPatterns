package com.strategy;

import com.strategy.fly.FlyWithoutWings;
import com.strategy.impl.MallardDuck;
import com.strategy.impl.RubberDuck;

public class Main {

    public static void main(String[] args) {

        Duck duck1 = new MallardDuck();
        Duck duck2 = new RubberDuck();

        duck2.setFlyBehavior(new FlyWithoutWings());

        System.out.println(duck1.quack());
        duck1.fly();

        System.out.println(duck2.quack());
        duck2.fly();
    }
}
