package com.frederick.state;

public interface ATMState {
    void insertCard();
    void ejectCard();
    void inputPin(int pin);
    void requestCash(int amount);
}
