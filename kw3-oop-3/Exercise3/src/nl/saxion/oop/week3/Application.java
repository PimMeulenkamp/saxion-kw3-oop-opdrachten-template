package nl.saxion.oop.week3;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        // TODO: Write your own translator classes. Have a look at the code below to get an idea how we used it!

//        // Uncomment one of these lines to select your translator.
//        DutchTranslation translator = new DutchTranslation();
//        AmericanTranslation translator = new AmericanTranslation();
//        RussianTranslator translator = new RussianTranslator();
//
//        SaxionApp.printLine("The following text is displayed in: " + translator.getLanguage());
//        SaxionApp.printLine();
//
//        SaxionApp.printLine(translator.getGreeting());
//        SaxionApp.printLine();
//        SaxionApp.printLine(translator.getExplanation());
//        SaxionApp.printLine();
//
//        SaxionApp.printLine("The current time would be printed as " + translator.getTimeInFormat() + " in this country.");
//        SaxionApp.printLine();
//
//        SaxionApp.printLine("1 Euro would be worth " + translator.convertFromEuro(1) + " "+ translator.getCurrency());
//        SaxionApp.printLine("25 Euro would be worth " + translator.convertFromEuro(25) + " "+ translator.getCurrency());

    }
}
