package com.design.patterns.oberver.pattern.hyperlocal;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Observer> observers = new ArrayList<>();
    private String status;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notify all observers of status change
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }
    public void setStatus (String status){
        this.status = status;
        System.out.println("Order status changed to: " + status);
        notifyObservers();
    }
}
