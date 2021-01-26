package com.frederick.state;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        // Case 1
        atm.inputPin(123456);
        atm.requestCash(1000);
        atm.ejectCard();

        // Case 2
        // atm.insertCard();
        // atm.insertCard();
        // atm.requestCash(100);
        // atm.inputPin(123);

        atm.insertCard();
        atm.inputPin(123456);
        atm.requestCash(3000);
        atm.requestCash(1000);
        atm.requestCash(1000);

        atm.insertCard();
        atm.inputPin(123456);
        atm.requestCash(1000);
        atm.ejectCard();
    }
}
