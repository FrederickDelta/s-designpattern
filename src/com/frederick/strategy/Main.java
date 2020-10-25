package com.frederick.strategy;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage(new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("foo.jpg");
    }
}