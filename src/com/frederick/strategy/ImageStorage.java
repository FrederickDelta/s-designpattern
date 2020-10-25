package com.frederick.strategy;

public class ImageStorage {
    private String compressor;
    private String filter;

    public ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(String fileName) {
        // Format: JPEG, PNG ...
        if (compressor == "jpeg") {
            System.out.println("Compressing using JPEG");
        } else if (compressor == "png") {
            System.out.println("Compressing using PNG");
        }

        // Filter: B&W, High Contrast
        if (filter == "b&w") {
            System.out.println("Applying B&W filter");
        } else if (filter == "high-contrast") {
            System.out.println("Applying high contrast filter");
        }
    }
}
