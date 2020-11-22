package com.frederick.observer;

public class Chart implements Observer {
    @Override
    public void Update() {
        System.out.println("Chart got updated");
    }
}
