package com.design.patterns.oberver.pattern.hyperlocal;

public class DeliveryAgent implements Observer {
    private String agentName;

    public DeliveryAgent(String agentName) {
        this.agentName = agentName;
    }

    @Override
    public void update(String orderStatus) {
        System.out.println("Delivery Agent " + agentName + " received order status update: " + orderStatus);
    }
}
