package com.design.patterns.strategy.design.completed.strategy;


public class SportDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("speed drive strategy");
    }
}
