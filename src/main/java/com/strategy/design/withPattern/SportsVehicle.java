package com.strategy.design.withPattern;

import com.strategy.design.withPattern.strategy.SportDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportDriveStrategy());
    }
}
