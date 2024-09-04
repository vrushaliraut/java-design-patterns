package com.strategy.design.completed;

import com.strategy.design.completed.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
