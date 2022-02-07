package nl.saxion.oop.week3;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 850, 300);
    }

    public void run() {
        // TODO: Create the diferent kind of lamps.. We have provided some code for you to experiment with!

//        // Create lamps
//        Lamp lamp = new Lamp();
//        DimmableLamp dimmable = new DimmableLamp(50);
//        PhilipsHUELamp hueLamp = new PhilipsHUELamp(Color.GREEN);
//
//        // Turn all lamps on
//        lamp.turnOn();
//        dimmable.turnOn();
//        hueLamp.turnOn();
//
//        // Print details for each lamp.
//        SaxionApp.printLine("Lamp: " + lamp);
//        SaxionApp.printLine("Dimmable lamp: " + dimmable);
//        SaxionApp.printLine("Philips HUE lamp: " + hueLamp);
//
//        // Draw lamps
//        lamp.draw(50, 100, 25);
//        dimmable.draw(125, 100, 25);
//        hueLamp.draw(200, 100, 25);
//        SaxionApp.pause();
//
//        // Clear the application
//        SaxionApp.clear();
//
//        // Now lets change the state for each lamp
//        lamp.turnOff();
//        dimmable.setBrightness(10);
//        hueLamp.setColor(Color.BLUE);
//        hueLamp.setBrightness(70);
//
//        // Print details for each lamp.
//        SaxionApp.printLine("Lamp: " + lamp);
//        SaxionApp.printLine("Dimmable lamp: " + dimmable);
//        SaxionApp.printLine("Philips HUE lamp: " + hueLamp);
//
//        // Draw lamps
//        lamp.draw(50, 100, 25);
//        dimmable.draw(125, 100, 25);
//        hueLamp.draw(200, 100, 25);
    }
}
