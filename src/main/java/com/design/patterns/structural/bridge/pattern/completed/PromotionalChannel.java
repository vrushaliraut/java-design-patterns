package com.design.patterns.structural.bridge.pattern.completed;

public class PromotionalChannel implements NotificationChannel{
    @Override
    public void send(String message) {
        System.out.println("Sending promotional message: " + message);
    }
}
