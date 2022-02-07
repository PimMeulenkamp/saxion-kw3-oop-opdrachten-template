package nl.saxion.oop.sampletest.ex1.model;

import nl.saxion.oop.sampletest.ex1.model.fines.ParkingFine;
import nl.saxion.oop.sampletest.ex1.model.persons.Person;

import java.util.ArrayList;

public class FineManager {
    private Person loggedIn;
    private final ArrayList<Person> listOfPersons;

    public FineManager() {
        listOfPersons = new ArrayList<>();

        // Officer
        Person rudy = new Person(123, "Rudy", "Dolphin");
        listOfPersons.add(rudy);

        // Regular person
        Person merlin = new Person(321, "Merlin", "Elephant");
        listOfPersons.add(merlin);
    }

    /**
     * Attempts to login a person, based on bsn.
     * @param bsn The bsn number from the person that is trying to log in.
     */
    public void login(int bsn) {
        loggedIn = getPersonByBSN(bsn);
    }

    /**
     * Logs out the current logged in person.
     */
    public void logout() {
        loggedIn = null;
    }

    /**
     * Helper method to retrieve the right "Person" instance based on BSN.
     * @param bsn The bsn number from the that needs to be found.
     * @return The Person instance which matches the bsn number (based on getBsn()). Null if the person cannot be found.
     */
    private Person getPersonByBSN(int bsn) {
        for (Person p : listOfPersons) {
            if(p.getBsn() == bsn) {
                return p;
            }
        }

        // TODO: Perhaps throw an exception here?
        return null;
    }

    /**
     * Method to answer the question whether or not the currently logged in user has any outstanding fines.
     * @return True, if the currently logged in user has any fines, false otherwise.
     */
    public boolean userHasFines() {
        return loggedIn.getNrOfFines() > 0;
    }

    /**
     * Show all fines from the currently logged in person.
     */
    public void printFines() {
        System.out.println(loggedIn);
    }

    /**
     * Example method on how to add fines in the current system.
     * The person issuing this fine is the currently logged in person.
     * @param offenderBSN The BSN number of the person that is receiving the fine.
     * @param colorOfZone The color of the parking zone which is the reason for this fine to be issued
     */
    public void addFine(int offenderBSN, String colorOfZone) {
        // TODO: Implement checks to make sure that "loggedIn" is actually a police officer!
        ParkingFine pf = new ParkingFine(loggedIn, colorOfZone);

        // TODO: What happens if the bsn number doesn't exist?
        Person offender = getPersonByBSN(offenderBSN);
        offender.addFine(pf);
    }

}
