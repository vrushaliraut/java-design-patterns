package com.design.patterns.decorator.pattern.completed.coffee.shop;

public class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.description() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1.0;
    }
}
