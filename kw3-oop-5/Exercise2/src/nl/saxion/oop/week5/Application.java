package nl.saxion.oop.week5;

import nl.saxion.app.SaxionApp;
import nl.saxion.oop.week5.model.*;

import java.awt.*;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 500, 768);
    }

    @Override
    public void run() {
//        SaxionApp.setBackgroundColor(Color.WHITE);
//
//        Cage cage1 = new Cage();
//        cage1.addAnimal(new Elephant("Dombo", true, 5000));
//        cage1.addAnimal(new Elephant("Jumbo", false, 3000));
//        cage1.addAnimal(new Elephant("Stampy", false, 6000));
//        cage1.draw(10, 10);
//
//        Cage cage2 = new Cage();
//        cage2.addAnimal(new Monkey("Abu", true, "Capuchin"));
//        cage2.addAnimal(new Monkey("Bokito", true, "Gorilla"));
//        cage2.draw(10, 180);
//
//        Cage cage3 = new Cage();
//        cage3.addAnimal(new Giraffe("Melman", true, 520));
//        cage3.draw(10, 350);
//
//        Cage cage4 = new Cage();
//        cage4.addAnimal(new Lion("Simba", true, true));
//        cage4.addAnimal(new Lion("Nala", false, true));
//        cage4.draw(10, 520);
    }
}
