package com.company;

public class Main {

    public static void main(String[] args) {
        Bill bill = new Bill(300);
        bill.setPaymentBehavior(new Cash());
        bill.performPayment();

        bill.setPaymentBehavior(new CreditCard("ameria","78768678"));
        bill.performPayment();

        Bill secondBill=new Bill(700);
        secondBill.setPaymentBehavior(new DebitCard("vtb","7676767"));
        secondBill.performPayment();
    }
}
