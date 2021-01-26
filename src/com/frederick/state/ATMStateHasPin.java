package com.frederick.state;

import java.sql.SQLOutput;

public class ATMStateHasPin implements ATMState {
    private ATM atm;

    public ATMStateHasPin(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("[Has PIN] You can not insert more than one card");
    }

    @Override
    public void ejectCard() {
        System.out.println("[Has PIN] Card ejected");
        atm.setAtmState(atm.getAtmStateNoCard());
    }

    @Override
    public void inputPin(int pin) {
        System.out.println("[Has PIN] You already input the PIN");
    }

    @Override
    public void requestCash(int amount) {
        if (amount > atm.getCashInATM()) {
            System.out.println("[Has PIN] This ATM doesn't have enough cash");
        } else {
            System.out.println("[Has PIN] Withdraw from your account $" + amount);
            atm.setCashInATM(atm.getCashInATM() - amount);
        }

        if (atm.getCashInATM() == 0) {
            atm.setAtmState(atm.getAtmStateNoCash());
        }
    }
}
