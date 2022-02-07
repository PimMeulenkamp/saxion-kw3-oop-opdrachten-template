package nl.saxion.oop.week6.model.insurables;

import nl.saxion.oop.week6.model.InsurableObject;

public class Car extends InsurableObject {
    String license;
    String brand;

    public Car(String license, String brand, int marketValue) {
        super(marketValue);

        this.license = license;
        this.brand = brand;
    }

    public String getLicense() {
        return license;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return getLicense() + " (" + getBrand() + ")";
    }
}
