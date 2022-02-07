# Using the `Comparable<T>` interface
## Difficulty: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) 

### Theory
For this assignment, we are going to use the `Comparable<T>` interface that comes standard in the java library.
You can use this interface to compare two objects (often of the same type).
The interface has one big advantage over the `equals()` method that is included in every class (and which you can also 
override yourself), and that is that it compares whether an object is smaller, equal to, or larger than the object you 
are comparing it to. (So it's a more extended version of comparing it!)

The `compareTo()` method returns:
- A negative number when the `this` object is smaller than the object being compared. (And thus should come before this object.)
- The number 0 if the objects are equal.
- A positive number when the `this` object is bigger than the sent object.
The interface can also be used to sort elements, since the `compareTo()`.

**How to implement the interface `Comparable<T>`**<br>
As with the `ArrayList<T>`, in the `T` position you enter the class name of the class you want to compare with.

For example, you can write a comparison method to compare objects of type `BingoNumber` with other objects of type `BingoNumber` by implementing the interface as follows. 
```java 
public class BingoNumber implements Comparable<BingoNumber> {
    private int number;
    private boolean isCrossedOut;

    @Override
    public int compareTo(BingoNumber other) {
        if (number < other.number) {
            return -1;
        else if (number == other.number) {
            return 0;
        else {
            return 1;
    }
}
```

You can see in the example above that the parameter sent in the `compareTo(BingoNumber other)` method is equal to the value you entered for generic type `T`.
More information about the Comparable interface can be found via the link at the bottom of the description.

### Task: Phonebook
We are going to build a phone book in which we store people. The phone book needs to be sorted so that we can easily print the phone book later on.
The sorting is based on last name, first name and then phone number. So, for example:
- Jansen, Jan (0612345678)
- Jansen, Piet (0601234567)
- Pothoven, Tristan (0698765432)
- Pothoven, Tristan (06999999)

You see here (just like with databases), that we first sort on last name, if there are equals then we sort on first name, and if those are also equal then we sort on phone number.

Build the phone book with a print method that prints the persons that are stored in the phone book sorted.
Make sure that each person implements the `Comparable<T>` interface, so that you can compare persons with each other.

### Hints
- You can sort an `ArrayList` by using the `Collections.sort()` (see links below).
- The `String` class has also implemented the `Comparable<T>`.

## Relevant links
* [Javadoc Comparable Interface](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html)
* [Javadoc Collections.sort()](https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html#sort(java.util.List))
* [Java Documentation SaxionApp](https://saxionapp.hboictlab.nl/nl/saxion/app/SaxionApp.html)


