package com.frederick.chainOfResponsibility;

public class Authenticator extends Handler {
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        var isValid = (request.getUsername() == "admin" && request.getPassword()=="123456");
        if (isValid) {
            System.out.println("Authentication passed");
        } else {
            System.out.println("Authentication failed");
        }
        ifStopHandle = !isValid;
        return ifStopHandle;
    }
}
