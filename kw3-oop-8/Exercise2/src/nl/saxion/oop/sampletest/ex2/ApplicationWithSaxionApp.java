package nl.saxion.oop.sampletest.ex2;

import nl.saxion.app.SaxionApp;

public class ApplicationWithSaxionApp implements Runnable {

    public static void main(String[] args){
        SaxionApp.start(new ApplicationWithSaxionApp(), 1024, 768);
    }

    @Override
    public void run() {
        SaxionApp.print("Please enter the clients name: ");
        String clientName = SaxionApp.readString();

        SaxionApp.print("Please enter the target time: ");
        int targetTime = SaxionApp.readInt();

        // TODO: Determine the routine for this client based on target time.
        // TODO: And print it.
    }
}
