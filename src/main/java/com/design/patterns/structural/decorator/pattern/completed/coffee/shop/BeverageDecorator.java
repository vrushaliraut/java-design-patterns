package com.design.patterns.decorator.pattern.completed.coffee.shop;

public abstract class BeverageDecorator implements Beverage {

    public final Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public String description() {
        return beverage.description();
    }

    public double cost() {
        return beverage.cost();
    }

    public abstract String getDescription();
}
