package com.thinkitive.microseervice.userservice.entity;

public class Payment {
    private int user_Id;
    private double amount;
    private String status;

    public Payment() {
    }

    public Payment(int user_Id, double amount, String status) {
        this.user_Id = user_Id;
        this.amount = amount;
        this.status = status;
    }

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}