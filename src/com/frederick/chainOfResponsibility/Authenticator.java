package com.frederick.chainOfResponsibility;

public class Authenticator {
    public boolean authenticate(HttpRequest request) {
        var isValid = (request.getUsername() == "admin" && request.getPassword()=="123456");
        return isValid;
    }
}
