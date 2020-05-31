package com.strategy.impl;

import com.strategy.Duck;
import com.strategy.quack.QuackSoundTwo;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.quackBehavior = new QuackSoundTwo();
    }

    @Override
    public String display() {
        return "Rubber";
    }
}
