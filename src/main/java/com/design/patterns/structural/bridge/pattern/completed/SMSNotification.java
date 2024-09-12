package com.design.patterns.structural.bridge.pattern.completed;

public class SMSNotification extends Notification{

    private NotificationChannel channel;

    public SMSNotification(NotificationChannel channel) {
        super(channel);
        this.channel = channel;
    }

    @Override
    public void notify(String message) {
        System.out.println("Sending SMS notification...");
        channel.send(message);
    }
}
