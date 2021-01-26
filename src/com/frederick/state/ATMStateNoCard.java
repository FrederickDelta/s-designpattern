package com.frederick.state;

public class ATMStateNoCard implements ATMState {
    private ATM atm;

    public ATMStateNoCard(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Now input your PIN please.");
        atm.setAtmState(atm.getAtmStateHasCard());
    }

    @Override
    public void ejectCard() {
        System.out.println("[No Card] No reaction to ejectCard");
    }

    @Override
    public void inputPin(int pin) {
        System.out.println("[No Card] No reaction to inputPin");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("[No Card] No reaction to requestCash");
    }
}
