package nl.saxion.oop.week3;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

//    private Teacher[] teachers = { new Teacher("Gerralt","Gottemaker"), new Teacher("Evert", "Duipmans"), new Teacher("Esther", "Hageraats"), new Teacher("Craig", "Bradley"), new Teacher("Tristan", "Pothoven") };

    public void run() {
        // TODO: Implement your own system. We have provided some Teacher examples above.
    }
}
