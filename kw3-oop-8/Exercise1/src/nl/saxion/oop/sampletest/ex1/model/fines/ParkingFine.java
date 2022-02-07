package nl.saxion.oop.sampletest.ex1.model.fines;

import nl.saxion.oop.sampletest.ex1.model.persons.Person;

public class ParkingFine {
    private final Person reportingOfficer;
    private String classification;

    // TODO: Parking fines should only be given by real police officers..
    public ParkingFine(Person reportingOfficer, String classification) {
        this.reportingOfficer = reportingOfficer;
        this.classification = classification.toLowerCase();
    }

    /**
     * Calculate the costs of this fine, based on the zone classification.
     * @return 100, if the classification is red, 50 for a yellow zone and 20 for a blue zone.
     */
    public int calculateCost() {
        if (classification.equals("red")) {
            return 100;
        } else if (classification.equals("yellow")) {
            return 50;
        } else {
            return 20;
        }
    }

    @Override
    public String toString() {
        return "Offender was parked in a " + classification + " zone. This costs €" + calculateCost() + ". Reported by: " + reportingOfficer.getFullName();
    }
}
