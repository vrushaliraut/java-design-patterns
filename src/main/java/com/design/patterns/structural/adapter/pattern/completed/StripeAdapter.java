package com.design.patterns.structural.adapter.pattern.completed;

import com.design.patterns.structural.adapter.pattern.starter.Stripe;

public class StripeAdapter implements PaymentProcessor {
    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        stripe.makePayment(amount);  // Adapts Stripe's method
    }
}