package com.design.patterns.structural.bridge.pattern.completed;

public class NotificationClientWithBridge {
    public static void main(String[] args) {
        NotificationChannel promotional = new PromotionalChannel();

        // Create an email notification with the promotional channel - polymorphism assignment
        /* Polymorphism allows one object to be treated as multiple types.
        In this case, promoEmail is of type Notification, but it refers to an instance of EmailNotification.
        This is a key concept in OOP, allowing objects to be manipulated in a more abstract way. */

        Notification promoEmail = new EmailNotification(promotional);
        promoEmail.notify("50% off on all products!");

        // Create a transactional channel
        NotificationChannel transactional = new TransactionalChannel();

        // Create an SMS notification with the transactional channel
        Notification transSMS = new SMSNotification(transactional);
        transSMS.notify("Your order has been shipped.");
    }
}
