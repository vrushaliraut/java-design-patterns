package com.design.patterns.behavioural.observer.pattern.hyperlocal;

public class Admin implements Observer {
    @Override
    public void update(String orderStatus) {
        System.out.println("Admin system received order status update: " + orderStatus);
    }
}
