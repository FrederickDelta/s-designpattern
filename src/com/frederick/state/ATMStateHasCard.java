package com.frederick.state;

public class ATMStateHasCard implements ATMState {
    private ATM atm;

    public ATMStateHasCard(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("[Has Card] You can not insert more than one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("[Has Card] Card ejected");
        atm.setAtmState(atm.getAtmStateNoCard());
    }

    @Override
    public void inputPin(int pin) {
        if (pin == 123456) {
            System.out.println("[Has Card] Correct PIN");
            atm.setPinCorrect(true);
            atm.setAtmState(atm.getAtmStateHasPin());
        } else {
            atm.setPinCorrect(false);
            System.out.println("[Has Card] Card ejected - Wrong PIN");
            atm.setAtmState(atm.getAtmStateNoCard());
        }

    }

    @Override
    public void requestCash(int amount) {
        System.out.println("[Has Card] Please input PIN first");
    }
}
