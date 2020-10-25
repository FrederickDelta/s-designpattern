package com.frederick.strategy;

public class ImageStorage {
    public void store(String fileName, Compressor compressor, Filter filter) {
        // Format: JPEG, PNG ...
        compressor.compress(fileName);

        // Filter: B&W, High Contrast
        filter.apply(fileName);
    }
}
