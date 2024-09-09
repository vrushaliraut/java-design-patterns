package com.design.patterns.oberver.pattern.hyperlocal;

public class HyperlocalDeliverySystem {
    public static void main(String[] args) {
        // Create the order (observable)
        Order order = new Order();

        // Create observers
        Customer customer = new Customer("John Doe");
        DeliveryAgent agent = new DeliveryAgent("Agent A");
        Restaurant restaurant = new Restaurant("The Great Eatery");
        Admin admin = new Admin();

        // Register observers with the order
        order.addObserver(customer);
        order.addObserver(agent);
        order.addObserver(restaurant);
        order.addObserver(admin);

        // Change order status and notify observers
        order.setStatus("Order Placed");
        order.setStatus("Preparing");
        order.setStatus("Out for Delivery");
        order.setStatus("Delivered");
    }
}
