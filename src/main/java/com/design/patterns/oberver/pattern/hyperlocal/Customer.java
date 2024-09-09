package com.design.patterns.oberver.pattern.hyperlocal;

public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String orderStatus) {
        System.out.println("Customer " + name + " received order status update: " + orderStatus);
    }
}
