package nl.saxion.oop.sampletest.ex1.model.persons;

import nl.saxion.oop.sampletest.ex1.model.fines.ParkingFine;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final int bsn;
    private final String firstName;
    private final String lastName;

    private List<ParkingFine> listOfParkingFines;

    public Person(int bsn, String firstName, String lastName) {
        this.bsn = bsn;
        this.firstName = firstName;
        this.lastName = lastName;

        listOfParkingFines = new ArrayList<>();
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void addFine(ParkingFine pf) {
        listOfParkingFines.add(pf);
    }

    public int getNrOfFines() {
        return listOfParkingFines.size();
    }

    public int getBsn() {
        return bsn;
    }

    @Override
    public String toString() {
        String result = "== Report for " + getFullName() + " (" + bsn + ") ==\n\n";

        for (ParkingFine f : listOfParkingFines) {
            result += f;
            result += '\n';
        }

        return result;
    }

}
