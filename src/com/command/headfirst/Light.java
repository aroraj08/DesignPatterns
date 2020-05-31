package com.command.headfirst;

public class Light {

    private String description;

    public Light(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println("Light ON for " + description );
    }

    public void off() {
        System.out.println("Light OFF for " + description );
    }
}
