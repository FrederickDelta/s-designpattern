package com.frederick.chainOfResponsibility;

public class Main {
    public static void main(String[] args){
        // authenticator -> logger -> compressor
        var compressor1 = new Compressor(null);
        var logger1 = new Logger(compressor1);
        var authenticator1 = new Authenticator(logger1);
        var webserver1 = new WebServer(authenticator1);
        webserver1.handle(new HttpRequest("admin", "123456"));
        webserver1.handle(new HttpRequest("john", "password"));

        // authenticator -> compressor
        var compressor2 = new Compressor(null);
        var authenticator2 = new Authenticator(compressor2);
        var webserver2 = new WebServer(authenticator2);
        webserver2.handle(new HttpRequest("admin", "123456"));
        webserver2.handle(new HttpRequest("john", "password"));
    }
}
