package nl.saxion.oop.week3;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }


    public void run() {

        // TODO: To help you out, we have provided a basic menu to get you started.
        while(true) {
            SaxionApp.clear();
            SaxionApp.printLine("[C]ollection, [L]end list, lend [O]ut, take back [I]n or e[X]it");
            char input = Character.toUpperCase(SaxionApp.readChar());
            SaxionApp.printLine("Selected option = '" + input + "'" );
            SaxionApp.printLine();
            switch (input) {
                case 'C':

                    // TODO: Implement this!

                    break;
                case 'L':

                    // TODO: Implement this!

                    break;
                case 'O':

                    // TODO: Implement this!

                    break;
                case 'I':

                    // TODO: Implement this!

                    break;
                case 'X':
                    SaxionApp.printLine("Exiting...");
                    return;
                default:
                    SaxionApp.printLine("Unknown option '" + input + "'");
            }

            // Inserted a pause here to stop the program from looping too fast.
            SaxionApp.pause();

        }
    }
}
