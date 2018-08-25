package com.company;

public class CreditCard extends Card{

    public CreditCard(String nameOnCard, String number) {
        super(nameOnCard, number);
    }

    @Override
    String getType() {
        return "credit card";
    }

    @Override
    void executeTransaction(int money) {

    }

}
