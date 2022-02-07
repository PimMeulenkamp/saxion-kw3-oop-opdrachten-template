package nl.saxion.oop.week3;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {

        // TODO: Initialize a "home" and "office".

        // Look at the code below to see how we want to use the classes you need to make!
//        // Print objects
//        SaxionApp.printLine(home);
//        SaxionApp.printLine(office);
//
//        // Change owner of the house
//        home.setOwner("Tristan Pothoven");
//
//        // Change company and number of employees
//        office.setCompanyName("University of Twente");
//        office.setNumberOfEmployees(200);
//
//        // Print objects again after changes
//        SaxionApp.printLine(home);
//        SaxionApp.printLine(office);
//
//        home.draw(20, 150);
    }
}
