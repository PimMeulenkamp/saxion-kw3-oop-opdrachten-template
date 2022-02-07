package nl.saxion.oop.week5;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
//        ArrayList<Calculation> calculations = new ArrayList<>();
//
//        // Add a bunch of calculations
//        calculations.add(new SumCalculation(5, 10));
//        calculations.add(new SubtractCalculation(20, 10));
//        calculations.add(new MultiplyCalculation(20, 6));
//        calculations.add(new DivisionCalculation(35, 7));
//        calculations.add(new DivisionCalculation(35, 0));
//
//        // Execute calculations
//        for (Calculation c : calculations) {
//            try {
//                SaxionApp.printLine(c);
//            } catch (IllegalStateException ise) {
//                SaxionApp.printLine("Error: " + ise.getMessage(), Color.RED);
//            }
//        }
    }
}
