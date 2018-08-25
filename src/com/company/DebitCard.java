package com.company;

public class DebitCard extends Card {
    public DebitCard(String nameOnCard, String number) {
        super(nameOnCard, number);
    }

    @Override
    String getType() {
        return "debit";
    }

    @Override
    void executeTransaction(int money) {

    }
}
