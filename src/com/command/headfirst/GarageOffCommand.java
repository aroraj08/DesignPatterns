package com.command.headfirst;

public class GarageOffCommand implements Command {

    final Garage garage;

    public GarageOffCommand(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void execute() {
        this.garage.off();
    }

    @Override
    public void undo() {
        this.garage.on();
    }
}
