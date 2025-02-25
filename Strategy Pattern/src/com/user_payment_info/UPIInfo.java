package com.user_payment_info;

public class UPIInfo extends PaymentInfo{
    String upiID;
    String number;

    public String getUpiID() {
        return upiID;
    }

    public void setUpiID(String upiID) {
        this.upiID = upiID;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public UPIInfo(String upiID, String number) {
        this.upiID = upiID;
        this.number = number;
    }
}
