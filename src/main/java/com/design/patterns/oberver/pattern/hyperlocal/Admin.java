package com.design.patterns.oberver.pattern.hyperlocal;

public class Admin implements Observer {
    @Override
    public void update(String orderStatus) {
        System.out.println("Admin system received order status update: " + orderStatus);
    }
}
