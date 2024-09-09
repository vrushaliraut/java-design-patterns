package com.design.patterns.oberver.pattern.hyperlocal;

public class Restaurant implements Observer {
    private String restaurantName;

    public Restaurant(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    @Override
    public void update(String orderStatus) {
        System.out.println("Restaurant " + restaurantName + " received order status update: " + orderStatus);
    }
}
