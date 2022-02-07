package nl.saxion.oop.week6.model;

public abstract class InsurableObject {
    private int marketValue;

    public InsurableObject(int marketValue) {
        this.marketValue = marketValue;
    }

    public int getMarketValue() {
        return marketValue;
    }
}
