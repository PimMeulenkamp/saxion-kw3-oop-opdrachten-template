package nl.saxion.oop.week4;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
//        CandyMachine machine = new CandyMachine();
//
//        // Add drinks
//        machine.addItem('A', 1, new Drink("Coca Cola", 2.00, 300, 20, false));
//        machine.addItem('A', 2, new Drink("RedBull", 2.50, 300, 100, true));
//
//        // Add snacks
//        machine.addItem('B', 1, new Candy("M&M's", 1.50, 230));
//        machine.addItem('B', 2, new Candy("Mars", 1.00, 230));
//        machine.addItem('B', 3, new Candy("Twix", 1.20, 230));
//        machine.addItem('B', 4, new Candy("Lion", 1.25, 230));
//        machine.addItem('B', 5, new Candy("Snickers", 1.50, 230));
//
//        for (int i = 0; i < 5; i++) {
//            machine.takeItem('A', 2);
//            machine.takeItem('B', 5);
//        }
//
//        machine.printReport();
    }
}
