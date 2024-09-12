package com.design.patterns.structural.bridge.pattern.completed;

public class EmailNotification extends Notification{

    private NotificationChannel channel;

    public EmailNotification(NotificationChannel channel) {
        super(channel);
        this.channel = channel;
    }

    @Override
    void notify(String message) {
        System.out.println("Sending email notification...");
        channel.send(message);
    }
}
