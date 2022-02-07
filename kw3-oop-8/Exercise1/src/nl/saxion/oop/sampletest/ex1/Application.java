package nl.saxion.oop.sampletest.ex1;

import nl.saxion.oop.sampletest.ex1.model.FineManager;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        FineManager fMan = new FineManager();

        fMan.login(promptLogin());
        System.out.println();

        int choice;
        do {
            System.out.println("1. Display my fines");
            // TODO: Add menu item 2 here.
            System.out.println("3. Issue fine [Officers only]");
            System.out.println("9. Logout and change user");
            System.out.println("0. Exit");
            System.out.println();
            System.out.print("Please select an entry from the menu: ");
            choice = readInt();
            System.out.println();

            if (choice == 1) {
                if (fMan.userHasFines()) {
                    fMan.printFines();
                } else {
                    System.out.println("This user has no outstanding fines!");
                }
            } else if (choice == 2) {
                // TODO: Implement this!
            } else if (choice == 3) {
                System.out.print("Please enter the BSN number of the offender: ");
                int offenderBSN = readInt();
                System.out.println();

                System.out.print("What type of zone was the offender parking in? ");
                String color = readString();

                fMan.addFine(offenderBSN, color);

            } else if (choice == 9) {
                fMan.logout();

                fMan.login(promptLogin());
            } else if (choice == 0) {
                System.out.println("Goodbye");
            }
            System.out.println();
        } while (choice != 0);
    }

    /**
     * Helper method that returns a BSN number.
     * @return an integer value representing a bsn number.
     */
    private static int promptLogin() {
        System.out.print("Please enter your BSN number: ");
        return readInt();
    }

    /**
     * Helper method that returns a String, read by Scanner.
     * @return a String value as returned by the user.
     */
    private static String readString() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    /**
     * Helper method that returns an integer, based on the readString() method.
     * @return the parsed value (as integer) read from user.
     */
    private static int readInt() {
        return Integer.parseInt(readString());
    }

    /**
     * Helper method that returns a boolean, based on readString() method.
     * @return the parsed value (as boolean) read from user.
     */
    private static boolean readBoolean() {
        return Boolean.parseBoolean(readString());
    }
}
