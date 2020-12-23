package com.frederick.bridge;

public class Main {
    public static void main(String[] args) {
        var sonyTV = new SonyTV();

        var sonyRC  = new RemoteControl(sonyTV);
        sonyRC.turnOn();
        sonyRC.turnOff();

        var sonyARC = new AdvancedRemoteControl(sonyTV);
        sonyARC.setChannel(1);
    }
}
