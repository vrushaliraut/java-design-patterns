package com.strategy.design.completed;

import com.strategy.design.completed.strategy.SportDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportDriveStrategy());
    }
}
