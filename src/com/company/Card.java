package com.company;

import com.company.interfaces.PaymentBehavior;

public abstract class Card implements PaymentBehavior {
    private final String nameOnCard;
    private final String number;

    public Card(String nameOnCard, String number) {
        this.nameOnCard = nameOnCard;
        this.number = number;
    }

    abstract String getType();

    abstract void executeTransaction(int money);

    @Override
    public void pay(int money) {
        System.out.println("Payed " + money + " cents using " + getType());
    }
}
