package com.strategy.impl;

import com.strategy.Duck;
import com.strategy.fly.FlyWithWings;
import com.strategy.quack.QuackSoundOne;

import java.util.Map;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.quackBehavior = new QuackSoundOne();
        this.flyBehavior = new FlyWithWings();
    }
    public String display() {
        return "Mallard Duck";
    }
}
