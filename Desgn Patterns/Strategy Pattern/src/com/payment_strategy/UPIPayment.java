package com.payment_strategy;

public class UPIPayment implements PaymentStrategy {
    String upiID;

    public UPIPayment(String upiID) {
        this.upiID = upiID;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid amount $"+amount+" using UPI-Id - "+ upiID);
    }
}
