package com.strategy;

import com.strategy.fly.Flyable;
import com.strategy.quack.Quackable;

public abstract class Duck {

    public Duck() {
    }

    protected Quackable quackBehavior;
    protected Flyable flyBehavior;

    public String swim() {
        return "I can swim";
    }

    public abstract String display();

    public String quack() {
        return this.quackBehavior.sound();
    }

    public void fly() {
        this.flyBehavior.fly();
    }

    public void setFlyBehavior(Flyable flyable) {
        this.flyBehavior = flyable;
    }

    public void setQuackBehavior(Quackable quackable) {
        this.quackBehavior = quackable;
    }
}
