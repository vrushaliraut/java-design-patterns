package com.strategy.design.withPattern;

import com.strategy.design.withPattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
