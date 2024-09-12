package com.design.patterns.structural.bridge.pattern.completed;

public class TransactionalChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("Sending transactional message: " + message);
    }
}
