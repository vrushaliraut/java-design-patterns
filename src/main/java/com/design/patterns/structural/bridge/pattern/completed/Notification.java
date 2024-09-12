package com.design.patterns.structural.bridge.pattern.completed;

abstract class Notification {
    protected NotificationChannel notificationChannel;

    public Notification(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    abstract void notify(String message);
}
