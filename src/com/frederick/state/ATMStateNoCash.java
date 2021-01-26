package com.frederick.state;

public class ATMStateNoCash implements ATMState {
    private ATM atm;

    public ATMStateNoCash(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("[No cash] You can not insert more than one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("[No Cash] Card ejected");
    }

    @Override
    public void inputPin(int pin) {
        System.out.println("[No cash] You already input the PIN");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("[No cash] This ATM doesn't have enough cash");
    }
}
