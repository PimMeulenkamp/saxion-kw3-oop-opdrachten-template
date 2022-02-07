# Export to CSV
## Difficulty: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) ![Outlined](../resources/star-outlined.svg) 

By default, every class has a `toString()` method that we can use to create a nice readable representation of our class.
With this assignment we also want to have a possibility to export a class to the CSV format. 

We start with an example so that you can see how your own `CSVExportable` should work. The goal of the task is to build an interface with the following methods:
- `String toCSV()` this method returns the values of the object, separated by a `;`.
- This method returns the names of the values.

### Example
In this example, we will use the following class:
```java
public class Car {
    private String licensePlate;
    private int price;
    
    // Rest of the implementation here...
    ...
}
```

Suppose the `Car` implements our interface and then we execute the following:
```java
Car c = new Car('XX-12-YY', 10000);
String header = c.getCSVHeader();
String csvData = c.toCSV();
``` 
The variable `header` should now contain: `"licensePlate;price"` and the variable `csvData` should now contain: `"XX-12-YY;10000"`.

## The actual exercise

You are now going to build your own interface `CSVExportable`, which contains two methods:
- `String toCSV()` this method returns the values of the object, separated by a `'`.
- The `String getCSVHeader()` method returns the names of the values.

Now we are going to use this interface and add it to a class. A supermarket has many different products. 
Each product has :
- a name
- a barcode (number)
- a price
- a stock (the number of items present in the supermarket)

Write the `CSVExportable` interface as described above. Then create the Product class and implement the methods of the interface in your class.
Build a list of products in your `Application` and convert the whole list to a CSV. Print this CSV with the SaxionApp.

### Write to a file (![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg))
Writing to a file is not very difficult, but we need to catch Exceptions that we don't know about yet (will be explained next week).
Have a look at the example on this website: W3Schools: [Java Create and Write To Files](https://www.w3schools.com/java/java_files_create.asp).
Export the list of products to the file `products.csv` and test whether your file can be read again with the `CSVReader`.

## Relevant links
* [Java documentation for the SaxionApp](https://saxionapp.hboictlab.nl/nl/saxion/app/SaxionApp.html)
