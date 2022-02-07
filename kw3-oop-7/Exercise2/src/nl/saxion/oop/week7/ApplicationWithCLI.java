package nl.saxion.oop.week7;

import java.util.Scanner;

public class ApplicationWithCLI {
    public static void main(String[] args) {
//        System.out.println("Enter file name for data: ");
//        String fileName = askString();
//        System.out.println();
//
//        try {
//            UserManager manager = new UserManager(fileName);
//            System.out.println("Successfully loaded user data..");
//            System.out.println();
//
//            System.out.print("Please enter the username: ");
//            String username = askString();
//
//            System.out.print("Please enter their password: ");
//            String password = askString();
//
//            if(manager.login(username, password)) {
//                System.out.println("User " + username + " successfully logged in.");
//            } else {
//                System.out.println("Login failed!");
//            }
//
//            // End of program
//
//        } catch (FileNotFoundException fnfe) {
//            System.err.println(fnfe);
//        }
    }

    /**
     * Asks the user for a string. The system will ask again if invalid input is provided by the user
     *
     * @return The entered String
     */
    public static String askString() {
        String enteredString = "";
        boolean askAgain = true;
        while (askAgain) {
            Scanner input = new Scanner(System.in);
            enteredString = input.nextLine();
            if (enteredString.length() != 0) {
                askAgain = false;
            } else {
                System.out.print("Error: Please enter at least one character.");
            }
        }
        return enteredString;
    }
}
