package com.design.patterns.structural.adapter.pattern.starter;

public class Stripe {
    public void makePayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via Stripe.");
    }
}
