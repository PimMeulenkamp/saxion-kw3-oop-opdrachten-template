package nl.saxion.oop.week5;

import nl.saxion.app.SaxionApp;

import java.util.ArrayList;

public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {

//        TransportCompany tc = new TransportCompany("Ruud's fancy transporting company");
//
//        // Constructor used: String id, int maxCapacity, int range
//        Bus b = new Bus("bus-1", 20, 500);
//
//        // Fill the bus with 15 passengers!
//        for (int i = 0; i < 15; i++) {
//            b.loadPassenger();
//        }
//
//        //Constructor used: String identifier, int maxCapacity, int depth, int width, int height
//        Truck t = new Truck("truck-1", 500, 10, 2, 3);
//        t.loadCargo(200);
//
//        // Constructor used: String identifier, int nrOfCargoCompartments, int nrOfPassengerCompartments
//        Train tr = new Train("train-1", 2, 1);
//
//        // Load a few passengers and some cargo on the train!
//        tr.loadPassengers(25);
//        tr.loadCargo(16000);
//
//        tc.addVehicle(b);
//        tc.addVehicle(t);
//        tc.addVehicle(tr);
//
//        ArrayList<Vehicle> vehiclesWithRoomFor10kgs = tc.getVehiclesWithRoomForCargo(10); // This should return both the truck and the train.
//        SaxionApp.printLine("Printing all vehicles that have room for 10 kg of cargo: ");
//        for(Vehicle v : vehiclesWithRoomFor10kgs) {
//            SaxionApp.printLine(v);
//        }
//
//        SaxionApp.printLine();
//
//        ArrayList<Vehicle> vehiclesWithRoomFor2000kgs = tc.getVehiclesWithRoomForCargo(2000); // This should return just the train
//        SaxionApp.printLine("Printing all vehicles that have room for 2000 kg of cargo: ");
//        for(Vehicle v : vehiclesWithRoomFor2000kgs) {
//            SaxionApp.printLine(v);
//        }
//
//        SaxionApp.printLine();
//
//        ArrayList<Vehicle> vehiclesWithRoomFor4pers = tc.getVehiclesWithRoomForPassengers(4); // This should return the bus and train.
//        SaxionApp.printLine("Printing all vehicles that have room for 4 persons: ");
//        for(Vehicle v : vehiclesWithRoomFor4pers) {
//            SaxionApp.printLine(v);
//        }
//
//        SaxionApp.printLine();
//
//        ArrayList<Vehicle> vehiclesWithRoomFor20pers = tc.getVehiclesWithRoomForPassengers(20); // This should return just the train.
//        SaxionApp.printLine("Printing all vehicles that have room for 20 persons: ");
//        for(Vehicle v : vehiclesWithRoomFor20pers) {
//            SaxionApp.printLine(v);
//        }
//
//        SaxionApp.printLine();
//
//        SaxionApp.pause();
//        SaxionApp.clear();
//
//        SaxionApp.printLine("Let's update the database for all updatable entities!");
//        tc.syncToDB();
    }
}
