package com.command.headfirst;

public class StereoOnWithCDCommand implements Command {

    final Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    @Override
    public void execute() {

        stereo.on();
        stereo.setCD();
        stereo.setVolume(10);
    }

    @Override
    public void undo() {
        this.stereo.off();
    }
}
