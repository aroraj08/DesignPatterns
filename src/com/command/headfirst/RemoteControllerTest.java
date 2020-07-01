package com.command.headfirst;

import java.util.Arrays;

public class RemoteControllerTest {

    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();

        Light kitchenLight = new Light("Kitchen Light");

        remoteController.setCommand(0, new LightOnCommand(kitchenLight), new LightOffCommand(kitchenLight));

        Garage garage = new Garage();
        remoteController.setCommand(1, new GarageOpenCommand(garage), new GarageOffCommand(garage));

        Stereo stereo = new Stereo();
        remoteController.setCommand(2, new StereoOnWithCDCommand(stereo), new StereoOffWithCDCommand(stereo));

        Light livingRoomLight = new Light("Kitchen Light");
        remoteController.setCommand(3, new LightOnCommand(livingRoomLight), new LightOffCommand(livingRoomLight));
        System.out.println(remoteController);

        remoteController.onButtonWasPressed(1);
        remoteController.offButtonWasPressed(1);
        remoteController.undoLastAction();

        remoteController.onButtonWasPressed(2);
        remoteController.offButtonWasPressed(2);
        remoteController.undoLastAction();

        remoteController.onButtonWasPressed(6);
        int[] a = {1, 4, 2, 4, 5, -1};
        Arrays.sort(a);

    }
}
