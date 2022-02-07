package nl.saxion.oop.week7;


import nl.saxion.oop.week7.model.vehicles.Car;
import nl.saxion.oop.week7.model.vehicles.MotorBike;
import nl.saxion.oop.week7.model.vehicles.Vehicle;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

public class Simulation {
    public static final int MIN_MINUTES = 20; // 20 minutes
    public static final int MAX_MINUTES = 7200; // 5 days
    private static final String AVAILABLE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private static String createRandomLicensePlate() {
        return String.format("%2d%2d-%s-%2d%2d",
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100),
                "" + AVAILABLE_CHARS.charAt(ThreadLocalRandom.current().nextInt(AVAILABLE_CHARS.length())) + AVAILABLE_CHARS.charAt(ThreadLocalRandom.current().nextInt(AVAILABLE_CHARS.length())),
                ThreadLocalRandom.current().nextInt(0, 100),
                ThreadLocalRandom.current().nextInt(0, 100));
    }

    public static Car createCar() {
        return new Car(createRandomLicensePlate(), LocalDateTime.now());
    }

    public static MotorBike createMotorBike() {
        return new MotorBike(createRandomLicensePlate(), LocalDateTime.now());
    }

    public static LocalDateTime createEndDate(Vehicle vehicle) {
        LocalDateTime startDate = vehicle.getStartDate();
        return startDate.plusMinutes(ThreadLocalRandom.current().nextInt(MIN_MINUTES, MAX_MINUTES));
    }
}
