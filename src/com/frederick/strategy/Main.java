package com.frederick.strategy;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("foo.jpg", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("bar.png", new PngCompressor(), new BlackAndWhiteFilter());
    }
}