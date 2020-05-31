package com.command.headfirst;

public class LightOffCommand implements Command {

    final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        this.light.off();
    }
}
