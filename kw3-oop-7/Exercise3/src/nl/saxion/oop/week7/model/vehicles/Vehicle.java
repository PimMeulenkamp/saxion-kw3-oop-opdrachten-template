package nl.saxion.oop.week7.model.vehicles;

import java.time.LocalDateTime;

public abstract class Vehicle {
    private String licensePlate;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Vehicle(String licensePlate, LocalDateTime startDate) {
        this.licensePlate = licensePlate;
        this.startDate = startDate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    // TODO: Perhaps this line below should change?
    public abstract double calculateCosts();
}
