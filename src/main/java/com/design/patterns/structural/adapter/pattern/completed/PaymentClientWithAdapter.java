package com.design.patterns.structural.adapter.pattern.completed;

import com.design.patterns.structural.adapter.pattern.starter.PayPal;
import com.design.patterns.structural.adapter.pattern.starter.Stripe;

public class PaymentClientWithAdapter {
    public static void main(String[] args) {
        // Use PayPal through the adapter
        PaymentProcessor paypalAdapter = new PaypalAdapter(new PayPal());
        paypalAdapter.processPayment(100.00);

        // Use Stripe through the adapter
        PaymentProcessor stripeAdapter = new StripeAdapter(new Stripe());
        stripeAdapter.processPayment(200.00);
    }
}
