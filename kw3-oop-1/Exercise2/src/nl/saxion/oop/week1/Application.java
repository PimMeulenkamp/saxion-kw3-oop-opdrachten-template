package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1200, 600);
    }

    public void run() {
        // TODO: Load videos from csv file.

        int menuInput = -1;
        do {
            SaxionApp.clear();
            SaxionApp.printLine("***************************************");
            SaxionApp.printLine("* 1) Show watchlist ");
            SaxionApp.printLine("* 2) Watch video");
            SaxionApp.printLine("* 0) Exit program");
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
            } else {
                SaxionApp.printLine("Goodbye!");
            }

        } while (menuInput != 0);
    }

}