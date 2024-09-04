package com.strategy.design.withPattern.strategy;


public class SportDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("speed drive strategy");
    }
}
