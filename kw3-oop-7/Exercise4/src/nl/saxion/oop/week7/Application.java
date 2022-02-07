package nl.saxion.oop.week7;

import nl.saxion.oop.week7.model.Helpdesk;

import java.util.Scanner;

/**
 * You don't have to make any adjustments to this class
 *
 * @author Evert Duipmans
 * @author Tristan Pothoven
 * @author Remco van Maanen
 */
public class Application {

    public static void main(String[] args) {
        Helpdesk helpdesk = new Helpdesk();

        // Read all the data -- You can comment this out if you want to start WITHOUT data.
        int numObjects = 0;
        // TODO: Enable me!
//        try {
//            numObjects = helpdesk.importData("Exercise4/users.csv", "Exercise4/tickets.csv");
//        } catch (HelpdeskException e) {
//            System.err.println(e.getMessage());
//        }
        System.out.println("Read: " + numObjects + " objects.");

        // Run the application
        boolean closing = false;
        while (!closing) {
            System.out.println("\n-----------\nI-Desk\n-----------");

            // User should first login
            if (loginUser(helpdesk)) {
                continue;
            }

            switch (showMenu(helpdesk)) {
                // Process choice
                case 1:
                    addTicket(helpdesk);
                    break;
                case 2:
                    System.out.println("Show my tickets:");
                    helpdesk.printMyTickets();
                    break;
                case 3:
                    resolveTicket(helpdesk);
                    break;
                case 4:
                    showOpenTickets(helpdesk);
                    break;
                case 5:
                    showAllTickets(helpdesk);
                    break;
                case 6:
                    showAllUsers(helpdesk);
                    break;
                case 9:
                    helpdesk.logout();
                    break;
                case 0:
                    closing = true;
                    break;
            }
        }
    }

    /**
     * Aks username and password and login the user until login is successful, return false if empty username is entered
     *
     * @param helpdesk
     */
    private static boolean loginUser(Helpdesk helpdesk) {
        while (!helpdesk.isLoggedOn()) {
            System.out.print("Please give your username: ");
            String inputUser = askString();
            System.out.print("Please give your password: ");
            String inputPassword = askString();
            if (helpdesk.login(inputUser, inputPassword)) {
                return true;
            }
            System.out.println("ERROR: Cannot login user. Invalid credentials");
        }
        return false;
    }

    /**
     * Show the menu (choices) and ask user for (valid) input
     *
     * @return user choice between 1 and 8
     */
    private static int showMenu(Helpdesk helpdesk) {
        // Show menu
        System.out.println("1. Add ticket");
        System.out.println("2. Show my tickets");
        if (helpdesk.isTroubleshooter()) {
            System.out.println("3. Resolve ticket");
            System.out.println("4. Show open tickets");
            System.out.println("5. Show all tickets");
            System.out.println("6. Show users");
        }
        System.out.println("9. Logout");
        System.out.println("0. Exit");
        System.out.println();

        while (true) {
            // Ask the user
            System.out.print("Choice: ");
            int choice = askNumber();
            if (choice >= 0 && choice <= 9) {
                System.out.println("-----------");
                return choice;
            }
        }
    }

    /**
     * Ask user for new ticket information and add that ticket
     *
     * @param helpdesk
     */
    private static void addTicket(Helpdesk helpdesk) {
        System.out.println("Add ticket:");
        System.out.println("Please enter the type (hardware or software):");
        String type = askString();

        while (!type.equalsIgnoreCase("hardware") && !type.equalsIgnoreCase("software")) {
            type = askString();
        }

        System.out.println("Please enter the description:");
        String description = askString();

        if (type.equalsIgnoreCase("hardware")) {
            System.out.println("Please enter the machine id:");
            String machineId = askString();
            int ticketNumber = helpdesk.addHardwareTicket(description, machineId);
            System.out.println("New ticket is created with number: " + ticketNumber);
        } else {
            System.out.println("Please enter the software name:");
            String softwareName = askString();
            int ticketNumber = helpdesk.addSoftwareTicket(description, softwareName);
            System.out.println("New ticket is created with number: " + ticketNumber);
        }
    }

    /**
     * Ask the user for a ticket number and resolve information and resolve it
     *
     * @param helpdesk
     */
    private static void resolveTicket(Helpdesk helpdesk) {
        System.out.println("Resolve ticket:");
        System.out.println("Please enter the ticket number:");
        int number = askNumber();
        System.out.println("Please enter the response:");
        String response = askString();

        // TODO: Enable me!
//        try {
//            helpdesk.resolveTicket(number, response);
//        } catch (HelpdeskException e) {
//            System.err.println(e.getMessage());
//        }
    }

    /**
     * Show a list of open tickets
     *
     * @param helpdesk
     */
    private static void showOpenTickets(Helpdesk helpdesk) {
        // TODO: Enable me!
//        System.out.println("Show open tickets:");
//        try {
//            helpdesk.printOpenTickets();
//        } catch (HelpdeskException e) {
//            System.err.println(e.getMessage());
//        }
    }

    /**
     * Show a list of all tickets
     *
     * @param helpdesk
     */
    private static void showAllTickets(Helpdesk helpdesk) {
        // TODO: Enable me!
//        System.out.println("Show all tickets:");
//        try {
//            helpdesk.printAllTickets();
//        } catch (
//                HelpdeskException e) {
//            System.err.println(e.getMessage());
//        }
    }

    /**
     * Show a list of all users
     *
     * @param helpdesk
     */
    private static void showAllUsers(Helpdesk helpdesk) {
        // TODO: Enable me!
//        System.out.println("Show all users:");
//        try {
//            helpdesk.printUsers();
//        } catch (HelpdeskException e) {
//            System.err.println(e.getMessage());
//        }
    }

    /**
     * Ask the user to enter a number. The system will ask the user again if incorrect input is provided by the user
     *
     * @return The entered number
     */
    private static int askNumber() {
        while (true) {
            Scanner input = new Scanner(System.in);
            try {
                int enteredNumber = Integer.parseInt(input.nextLine());
                if (enteredNumber >= 0) {
                    return enteredNumber;
                }
                System.out.print("Error: Please enter a positive number.");
            } catch (NumberFormatException e) {
                System.out.print("Error: Please enter a valid positive number.");
            }
        }
    }

    /**
     * Aks the user for a string. The system will ask again if invalid input is provided by the user
     *
     * @return The entered String
     */
    public static String askString() {
        while (true) {
            Scanner input = new Scanner(System.in);
            String enteredString = input.nextLine();
            if (enteredString.length() != 0) {
                return enteredString;
            }
            System.out.print("Error: Please enter at least one character.");
        }
    }
}