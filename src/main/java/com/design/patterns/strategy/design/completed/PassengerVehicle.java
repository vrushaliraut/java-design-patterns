package com.design.patterns.strategy.design.completed;

import com.design.patterns.strategy.design.completed.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
