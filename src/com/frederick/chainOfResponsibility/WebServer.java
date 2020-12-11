package com.frederick.chainOfResponsibility;

public class WebServer {
    public void handle(HttpRequest request) {
        // Authentication
        var authenticator = new Authenticator();
        if (authenticator.authenticate(request))
        {
            System.out.println("Authentication passed");
            // Logging
            var logger = new Logger();
            logger.log(request);
            // Compression
            var compressor = new Compressor();
            compressor.compress(request);
        } else {
            System.out.println("Authentication failed");
        }

    }
}
