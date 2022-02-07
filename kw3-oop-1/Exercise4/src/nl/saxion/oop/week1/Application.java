package nl.saxion.oop.week1;

import nl.saxion.app.SaxionApp;

public class Application implements Runnable {
	public static void main(String[] args) {
		SaxionApp.start(new Application());
	}

	public void run() {

		// Usage example, assume the car does 10 km to a litre gas:
		// myCar.getCurrentFuel(); --> Suppose this returns 50 litres
		// myCar.drive(100);
		// myCar.getCurrentFuel(); --> This should now return 40 litres

		int menuInput = -1;
		do {
			SaxionApp.clear();
			SaxionApp.printLine("***************************************");
			SaxionApp.printLine("* 1) Display statistics of the car ");
			SaxionApp.printLine("* 2) Drive some kilometers");
			SaxionApp.printLine("* 3) Refuel");
			SaxionApp.printLine("* 0) Exit program");
			SaxionApp.printLine("***************************************");

			SaxionApp.print("Please make a selection from the menu: ");
			menuInput = SaxionApp.readInt();

			SaxionApp.printLine();

			if(menuInput == 1) {

				// TODO: Your implementation here

				SaxionApp.pause();
			} else if (menuInput == 2) {

				// TODO: Your implementation here

				SaxionApp.pause();
			} else if (menuInput == 3) {

				// TODO: Your implementation here

				SaxionApp.pause();
			} else {
				SaxionApp.printLine("Goodbye!");
			}

		} while(menuInput != 0);
	}


}
