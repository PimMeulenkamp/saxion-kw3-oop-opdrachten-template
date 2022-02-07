package nl.saxion.oop.week6.model.insurables;

import nl.saxion.oop.week6.model.InsurableObject;

public class House extends InsurableObject {
    private String adress;

    public House(String address, int marketValue) {
        super(marketValue);
        this.adress = address;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return adress + " (" + getMarketValue()+ ")";
    }
}
