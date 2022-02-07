package nl.saxion.oop.sampletest.ex2;

import java.util.Scanner;

public class ApplicationWithoutGUI {

    public static void main(String[] args){
        System.out.print("Please enter the clients name: ");
        String clientName = readString();

        System.out.print("Please enter the target time: ");
        int targetTime = readInt();

        // TODO: Determine the routine for this client based on target time.
        // TODO: And print it.
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
}
