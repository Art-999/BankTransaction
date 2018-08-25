package com.company;

import com.company.interfaces.PaymentBehavior;

public class Cash implements PaymentBehavior {
    @Override
    public void pay(int money) {
        System.out.println("Payed " + money + " cents using cash");
    }
}
