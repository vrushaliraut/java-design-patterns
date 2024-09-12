package com.design.patterns.decorator.pattern.completed.coffee.shop;

public class Coffee implements Beverage{
    @Override
    public String description() {
        return "Coffee";
    }

    @Override
    public double cost() {
        return 5.0;
    }
}
