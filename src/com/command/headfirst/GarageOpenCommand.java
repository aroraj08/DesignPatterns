package com.command.headfirst;

public class GarageOpenCommand implements Command {

    final Garage garage;

    public GarageOpenCommand(Garage garage) {
        this.garage = garage;
    }


    @Override
    public void execute() {
        this.garage.on();
    }

    @Override
    public void undo() {
        this.garage.off();
    }
}
