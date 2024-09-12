package com.design.patterns.decorator.pattern.completed.coffee.shop;

public class SugarDecorator extends BeverageDecorator {
    public SugarDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.description() + ", Sugar";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
