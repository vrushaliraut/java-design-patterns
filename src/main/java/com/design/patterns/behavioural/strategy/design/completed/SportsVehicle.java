package com.design.patterns.strategy.design.completed;

import com.design.patterns.strategy.design.completed.strategy.SportDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportDriveStrategy());
    }
}
