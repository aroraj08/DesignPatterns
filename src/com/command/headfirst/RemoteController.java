package com.command.headfirst;

import com.bridge.remotes.Remote;

public class RemoteController {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteController() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand  = new NoCommand();
        for (int i=0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
        }

        for (int i=0; i < offCommands.length; i++) {
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoLastAction() {
        this.undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n--- Remote Controller\n");
        for (int i=0; i<onCommands.length; i++) {
            sb.append("[slot " + i + "] " + onCommands[i].getClass().getName()
            + "   " + offCommands[i].getClass().getName() + "\n");
        }
        return sb.toString();
    }
}
