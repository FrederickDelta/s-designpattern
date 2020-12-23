package com.frederick.bridge;

public class Main {
    public static void main(String[] args) {
        RemoteControl sonyRC  = new SonyRemoteControl();
        sonyRC.turnOn();
        sonyRC.turnOff();

        AdvancedRemoteControl sonyARC = new SonyAdvancedRemoteControl();
        sonyARC.setChannel(1);
    }
}
