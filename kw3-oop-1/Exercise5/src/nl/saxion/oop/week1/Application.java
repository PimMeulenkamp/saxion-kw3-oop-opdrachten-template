package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
        // TEST - Scenario 1: The successful way
        // plane.loadPassengers();
        // plane.loadLuggage();
        // plane.lockDoors();
        // plane.depart();

        // TEST - Scenario 2: Failure due to locked doors
        // plane.lockDoors();
        // plane.loadPassengers(); <-- This should result in a print stating that we cannot depart!

        // TEST - Scenario 3: Failure due to not loading passengers
        // plane.loadLuggage();
        // plane.lockDoors();
        // plane.depart(); <-- This should result in a print stating that we cannot depart!

        int menuInput = -1;
        do {
            SaxionApp.clear();
            SaxionApp.printLine("****** Aircraft preparation terminal ******");
            SaxionApp.printLine("* 1) Load passengers");
            SaxionApp.printLine("* 2) Load luggage");
            SaxionApp.printLine("* 3) Lock/Unlock doors ");
            SaxionApp.printLine("* 9) Depart ");
            SaxionApp.printLine("* 0) Exit!");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");
            menuInput = SaxionApp.readInt();

            SaxionApp.printLine();

            if (menuInput == 1) {

                // TODO: Your implementation here

                SaxionApp.pause();
            } else if (menuInput == 2) {

                // TODO: Your implementation here

                SaxionApp.pause();
            } else if (menuInput == 3) {

                // TODO: Your implementation here

                SaxionApp.pause();
            } else if (menuInput == 9) {

                // TODO: Your implementation here

                SaxionApp.pause();
            }

        } while (menuInput != 0);

    }
}
