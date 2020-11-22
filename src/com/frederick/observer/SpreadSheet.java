package com.frederick.observer;

public class SpreadSheet implements Observer {
    @Override
    public void Update() {
        System.out.println("SpreadSheet got notified");
    }
}
