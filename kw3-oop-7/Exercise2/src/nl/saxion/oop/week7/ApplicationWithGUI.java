package nl.saxion.oop.week7;

import nl.saxion.app.SaxionApp;

public class ApplicationWithGUI implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new ApplicationWithGUI());
    }

    public void run() {

//        SaxionApp.print("Enter file name for data: ");
//        String fileName = SaxionApp.readString();
//        SaxionApp.printLine();
//
//        try {
//            UserManager manager = new UserManager(fileName);
//            SaxionApp.printLine("Successfully loaded user data..");
//            SaxionApp.printLine();
//
//            SaxionApp.print("Please enter the username: ");
//            String username = SaxionApp.readString();
//
//            SaxionApp.print("Please enter their password: ");
//            String password = SaxionApp.readString();
//
//            if(manager.login(username, password)) {
//                SaxionApp.printLine("User " + username + " successfully logged in.", Color.GREEN);
//            } else {
//                SaxionApp.printLine("Login failed!", Color.RED);
//            }
//
//            // End of program
//
//        } catch (FileNotFoundException fnfe) {
//            SaxionApp.printLine(fnfe, Color.RED);
//        }
    }
}
