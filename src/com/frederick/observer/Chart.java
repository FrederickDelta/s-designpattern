package com.frederick.observer;

public class Chart implements Observer {
    @Override
    public void Update(int value) {
        System.out.println("Chart got updated: " + value);
    }
}
