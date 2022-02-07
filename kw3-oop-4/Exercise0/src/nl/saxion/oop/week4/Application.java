package nl.saxion.oop.week4;

import nl.saxion.app.CsvReader;
import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {


    public static void main(String[] args) {
        SaxionApp.start(new Application(), 800, 600);
    }

    @Override
    public void run() {
        int menuInput = -1;

        do {
            SaxionApp.clear();
            SaxionApp.printLine("****** Order system ******");
            SaxionApp.printLine("* 1) Show menu and place order");
            SaxionApp.printLine("* 2) Show entire order ");
            SaxionApp.printLine("* 0) Exit!");
            SaxionApp.printLine("***************************************");

            SaxionApp.print("Please make a selection from the menu: ");

            menuInput = SaxionApp.readInt();

            if (menuInput == 1) {
                SaxionApp.clear();

                // TODO: Show menu items and allow orders to be placed.

                SaxionApp.pause();
            } else if (menuInput == 2) {
                SaxionApp.clear();

                // TODO: Show entire order

                SaxionApp.pause();
            } else if (menuInput != 0) {
                SaxionApp.printLine("Invalid choice, please try again", Color.RED);
                SaxionApp.pause();
            }
        } while (menuInput != 0);
        SaxionApp.printLine("Thank you, please come again");
    }

    /**
     * Here's a template to load in the data from menuitems more easily!
     */
    public void loadItems() { // Change the returnType to a list of your liking!
        CsvReader reader = new CsvReader("Exercise0/menuitems.csv");
        reader.skipRow();
        reader.setSeparator(',');

        while (reader.loadRow()) {
            String itemType = reader.getString(0); // "d" for Drink, "f" for Food.
            String itemName = reader.getString(1);
            double itemPrice = reader.getDouble(2);

            if(itemType.equalsIgnoreCase("f")) {
                int foodForNrOfPeople = reader.getInt(3); // How many people can eat from this snack, if the type is "food"
                boolean foodIsHot = reader.getString(4).equalsIgnoreCase("true"); // Is this snack hot?

                // TODO: Create proper instance out of this information!

            } else if(itemType.equalsIgnoreCase("d")) {
                int drinkVolumeMl = reader.getInt(3); // How much ml is this drink?
                boolean drinkHasAlcohol = reader.getString(4).equalsIgnoreCase("true"); // Does the drink contain alcohol?

                // TODO: Create proper instance out of this information!
            } else {
                // We don't know what to do here.. continue to the next line.
                continue;
            }
        }
    }

}
