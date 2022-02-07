package nl.saxion.oop.week7.model.vehicles;

import java.time.LocalDateTime;

public class MotorBike extends Vehicle {

    public MotorBike(String licensePlate, LocalDateTime startDate) {
        super(licensePlate, startDate);
    }

    @Override
    public double calculateCosts() {
        // TODO: Fix this method. It should also throw an exception!
        return 0.0;
    }
}
