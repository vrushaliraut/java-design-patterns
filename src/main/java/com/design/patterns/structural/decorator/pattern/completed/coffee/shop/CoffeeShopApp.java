package com.design.patterns.decorator.pattern.completed.coffee.shop;

public class CoffeeShopApp {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        System.out.println("Plain " + coffee.description() + " $" + coffee.cost());

        // Add Milk
        coffee = new MilkDecorator(coffee);
        System.out.println("Add Milk into " + coffee.description() + " $" + coffee.cost());

        // Add Sugar
        coffee = new SugarDecorator(coffee);
        System.out.println("Add Sugar into " + coffee.description() + " $" + coffee.cost());
    }
}
