package com.frederick.strategy;

public class ImageStorage {
    private Compressor compressor;
    private Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        // Format: JPEG, PNG ...
        compressor.compress(fileName);

        // Filter: B&W, High Contrast
        filter.apply(fileName);
    }
}
