package com.bridge;

import com.bridge.devices.Device;
import com.bridge.devices.Radio;
import com.bridge.devices.Tv;
import com.bridge.remotes.AdvancedRemote;
import com.bridge.remotes.BasicRemote;

/**
 * Bridge is a structural design pattern that lets you split a large class 
 * or a set of closely related classes into two separate hierarchies—abstraction and implementation— 
 * which can be developed independently of each other.
 *
 * The Device classes act as the implementation, whereas the Remotes act as the abstraction.
 */
public class BridgeMain {
	public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
