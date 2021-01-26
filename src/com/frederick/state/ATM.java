package com.frederick.state;

public class ATM {
    private ATMState atmStateNoCard;
    private ATMState atmStateHasCard;
    private ATMState atmStateHasPin;
    private ATMState atmStateNoCash;

    private ATMState atmState;

    private int cashInATM = 2000;
    private boolean isPinCorrect = false;

    public ATM() {
        atmStateNoCard = new ATMStateNoCard(this);
        atmStateHasCard = new ATMStateHasCard(this);
        atmStateHasPin = new ATMStateHasPin(this);
        atmStateNoCash = new ATMStateNoCash(this);

        atmState = atmStateNoCard;

        if (cashInATM <=0 ){
            atmState = atmStateNoCash;
        }
    }

    public ATMState getAtmStateNoCard() { return atmStateNoCard; }
    public ATMState getAtmStateHasCard() { return atmStateHasCard; }
    public ATMState getAtmStateHasPin() { return atmStateHasPin; }
    public ATMState getAtmStateNoCash() { return atmStateNoCash; }

    public void setAtmState(ATMState atmState) { this.atmState = atmState; }
    public void setCashInATM(int cashInATM) { this.cashInATM = cashInATM; }
    public int getCashInATM()  { return this.cashInATM; }
    public void setPinCorrect(boolean isPinCorrect) { this.isPinCorrect = isPinCorrect; }

    public void insertCard() { atmState.insertCard(); }
    public void ejectCard() { atmState.ejectCard(); }
    public void inputPin(int pin) { atmState.inputPin(pin); }
    public void requestCash(int amount) { atmState.requestCash(amount); }

}
