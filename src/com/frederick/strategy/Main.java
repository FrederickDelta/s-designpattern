package com.frederick.strategy;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage("jpeg", "high-contrast");
        imageStorage.store("foo.jpg");
    }
}