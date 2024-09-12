package com.design.patterns.structural.adapter.pattern.starter;

public class PayPal {
    public void sendPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via PayPal.");
    }
}
