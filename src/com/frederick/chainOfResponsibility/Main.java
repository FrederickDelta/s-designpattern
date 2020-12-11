package com.frederick.chainOfResponsibility;

public class Main {
    public static void main(String[] args){
        var server = new WebServer();

        var request1 = new HttpRequest("John", "password");
        server.handle(request1);

        var request2 = new HttpRequest("admin", "123456");
        server.handle(request2);
    }
}
