package nl.saxion.oop.week4;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
       // You don't need to write code for this assignment!!!!
    }
}
