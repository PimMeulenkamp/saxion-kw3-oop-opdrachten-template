package nl.saxion.oop.week5;

import nl.saxion.app.SaxionApp;


public class Application implements Runnable {
    public static void main(String[] args) {
        SaxionApp.start(new Application());
    }

    public void run() {
//        ArrayList<Product> products = new ArrayList<>();
//
//        // Add a bunch of products
//        products.add(new Product("Cheese", 1, 3.00, 50));
//        products.add(new Product("Ham", 2, 2.50, 50));
//        products.add(new Product("Bread", 3, 1.50, 20));
//        products.add(new Product("Pizza", 4, 4.00, 10));
//        products.add(new Product("Chocolate Chip Cookies", 5, 3.20, 12));
//
//        // Print in CSV format
//        SaxionApp.printLine(products.get(0).getCSVHeader());
//        for (Product p : products) {
//            SaxionApp.printLine(p.toCSV());
//        }

        // Bonus: Write to file

    }
}
