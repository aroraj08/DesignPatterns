package com.strategy.fly;

public class FlyWithoutWings implements Flyable {
    @Override
    public void fly() {
        System.out.println("Fly with magic");
    }
}
