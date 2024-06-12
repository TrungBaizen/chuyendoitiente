package com.example.ungdungcdtt.model;

public class CurrencyModel {
    private final double EXCHANGE_RATE = 23000;
    private double amount;
    private double result;

    public CurrencyModel(double amount) {
        this.amount = amount;
        this.result = amount * EXCHANGE_RATE;
    }

    public CurrencyModel() {
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getResult() {
        return result;
    }
}
