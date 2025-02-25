package com.user_payment_info;

import javax.print.DocFlavor;

public class CardInfo extends PaymentInfo{
    String number;
    String owner;
    String cvv;
    String expiry;

    public CardInfo(String number, String owner, String cvv, String expiry) {
        this.number = number;
        this.owner = owner;
        this.cvv = cvv;
        this.expiry = expiry;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }
}
