package com.company;

import com.company.interfaces.PaymentBehavior;

public class Bill {
    private final int money;
    private PaymentBehavior paymentBehavior;

    public Bill(int money) {
        this.money = money;
    }

    public void setPaymentBehavior(PaymentBehavior paymentBehavior) {
        this.paymentBehavior = paymentBehavior;
    }

    public void performPayment() {
        if (paymentBehavior != null) {
            paymentBehavior.pay(money);
        } else {
            System.out.println("System can't do your payment transaction");
        }

    }
}
