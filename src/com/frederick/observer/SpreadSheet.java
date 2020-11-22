package com.frederick.observer;

public class SpreadSheet implements Observer {
    @Override
    public void Update(int value) {
        System.out.println("SpreadSheet got notified: " + value);
    }
}
