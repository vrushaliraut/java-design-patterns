package com.design.patterns.structural.bridge.pattern.starter;

public class NotificationClient {
    public static void main(String[] args) {
        PromotionalEmailNotification promoEmail = new PromotionalEmailNotification();
        TransactionalEmailNotification transEmail = new TransactionalEmailNotification();
        PromotionalSMSNotification promoSMS = new PromotionalSMSNotification();
        TransactionalSMSNotification transSMS = new TransactionalSMSNotification();

        promoEmail.send("50% off on all products!");
        transEmail.send("Your order has been shipped.");
        promoSMS.send("Buy one get one free!");
        transSMS.send("Your account balance is low.");
    }
}
