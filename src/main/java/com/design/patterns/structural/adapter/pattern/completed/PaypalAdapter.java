package com.design.patterns.structural.adapter.pattern.completed;

import com.design.patterns.structural.adapter.pattern.starter.PayPal;

public class PaypalAdapter implements PaymentProcessor {

    private PayPal payPal;

    public PaypalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(double amount) {
        payPal.sendPayment(amount);  // Adapts PayPal's method
    }
}
