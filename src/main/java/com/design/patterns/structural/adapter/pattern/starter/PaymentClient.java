package com.design.patterns.structural.adapter.pattern.starter;

public class PaymentClient {
    public static void main(String[] args) {
        PayPal payPal = new PayPal();
        payPal.sendPayment(100.00);

        Stripe stripe = new Stripe();
        stripe.makePayment(200.00);
    }
}
