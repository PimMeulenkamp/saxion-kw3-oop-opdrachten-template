package nl.saxion.oop.week3;

import nl.saxion.app.SaxionApp;

import java.awt.Color;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        // TODO: implement your versions of Shape, Rectangle, Square and Circle. We have provided the code that we used to create the sample_output images below.

//        Rectangle[] rectangles = { new Rectangle(50, 50, 200, 100, Color.RED), new Rectangle(50, 250, 300, 150, Color.GREEN), new Rectangle(50, 450, 400, 50, Color.YELLOW)};
//        Circle[] circles = { new Circle(100, 100, 50, Color.RED), new Circle(100, 300, 75, Color.GREEN), new Circle(100, 600, 100, Color.YELLOW)};
//        Square[] squares = {new Square(50, 50, 50, Color.RED), new Square(50, 250, 250, Color.GREEN), new Square(50, 600, 100, Color.YELLOW)};
//
//        // Print all rectangles
//        for(Rectangle r : rectangles) {
//            r.draw();
//
//            SaxionApp.turnBorderOff();
//            int textX = 700;
//            int textY = r.getY();
//
//            SaxionApp.drawBorderedText("Circumference: "+ r.getCircumference() + " (pixels)", textX, textY, 20);
//            SaxionApp.drawBorderedText("Area: "+ r.getArea() + " (pixels)", textX, textY + 20, 20);
//        }
//
//        SaxionApp.pause();
//        SaxionApp.clear();
//
//        // Print all circles
//        for(Circle c : circles) {
//            c.draw();
//
//            SaxionApp.turnBorderOff();
//            int textX = 300;
//            int textY = c.getY() - (int) (0.5 * c.getRadius());
//
//            SaxionApp.drawBorderedText("Circumference: "+ c.getCircumference() + " (pixels)", textX, textY, 20);
//            SaxionApp.drawBorderedText("Area: "+ c.getArea() + " (pixels)", textX, textY + 20, 20);
//        }
//
//        SaxionApp.pause();
//        SaxionApp.clear();
//
//        // Print all squares
//        for(Square s : squares) {
//            s.draw();
//
//            SaxionApp.turnBorderOff();
//            int textX = 500;
//            int textY = s.getY();
//
//            SaxionApp.drawBorderedText("Circumference: "+ s.getCircumference() + " (pixels)", textX, textY, 20);
//            SaxionApp.drawBorderedText("Area: "+ s.getArea() + " (pixels)", textX, textY + 20, 20);
//        }
    }
}
