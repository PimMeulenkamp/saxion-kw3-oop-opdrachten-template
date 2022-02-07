package nl.saxion.oop.week4;

import nl.saxion.app.SaxionApp;

import java.awt.*;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {

        // The line below is the key to this exercise.
//        Shape[] shapes = { new Circle(500, 350, 150, Color.RED), new Rectangle(300, 300, 400, 250, Color.BLUE), new Square(300, 300, 200, Color.GREEN)};

//        for(Shape s : shapes) {
//            SaxionApp.clear();
//
//            SaxionApp.printLine("Type of shape: " + s.getClass().getSimpleName());
//
//            SaxionApp.printLine("Circumference: " + s.getCircumference());
//            SaxionApp.printLine("Area: " + s.getArea());
//
//            s.draw();
//
//            SaxionApp.pause();
//        }
    }
}
