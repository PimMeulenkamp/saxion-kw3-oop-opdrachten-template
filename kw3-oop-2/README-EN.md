# Complex data structures

Competency: _I can create programs that use a class design with composition, and I am able to handle errors using exceptions._

The assignments can be found in the separate modules.

# Introduction

Last week we used the basics of _encapsulation_ to give classes responsibilities. Consider
for example, the example of the class `Person` which, by adding getters / settters and constructors,
has been made responsible for properly maintaining an internal test state (_state_). Invalid states, such as
e.g. negative ages or names that are not filled in, have been prevented by this.

Because we are now able to give classes their own responsibilities, it is also possible to build larger applications that use these classes.
applications that make use of these classes. (After all, the logic in the classes is now easily reusable!) This week we are going to look at how to do this and what is involved in this
involved. We're going to look at using classes in a larger context. We will also look at how error handling works and
how you, as a class, can indicate that either something has gone wrong or is about to go wrong. We do this by looking at _exceptions_.

Before we can get into this, however, it's wise to introduce a new concept: _overloading_.

## Overloading: Constructors and methods

As you may have noticed, naming is hugely important in programming. It helps you to clearly
understand how something works and can help with starting to set expectations about what something does. Take for example the
method `printLine` that you've been using frequently by now. This method allows you to print something, but it
accepts all kinds of arguments, such as an _int_, a _double_, a String, etc.

 ```java
int number = 7;
String sentence = "Hello";

SaxionApp.printLine(number);
SaxionApp.printLine(sentence);
 ```

What you might not have thought about is how to define this printLine if you wanted to write it yourself.
As you know, as soon as you write a method, you have to indicate which arguments it requires and these arguments can only be of one type. So in order to implement the above functionality, you *must* have 2 different types of methods. Methods
are allowed to have _the same_ name with different arguments, with the result that you can have the following methods in the same class:

```java
public void printLine(int number) {...}
public void printLine(double number) {...}
public void printLine(String text) {...}
public void printLine(boolean someBoolean) {...}
```

The above principle, where you have four methods with _exactly_ the same name, but with different arguments is called _method overloading_. _Method overloading_ is a concept in which you give a method (with similar functionality) the same name, as long as the type of the arguments differ. Thus, it is not allowed to change only the name of the arguments.

We also call this formally that the _signature_ (signature) of the method must be different: `printLine(int)` is
different from `printLine(double)`, which in turn is different from `printLine(String)`, etc.

### Implementing overloaded methods

If the name of a method is the same, you would expect the functionality of these methods to be
is approximately the same. And you would be right... _overloaded_ methods probably share much of certain
functionality. Depending on the reason for which you want to apply _method overloading_ you may just have to deal
with a situation where code duplication seems unavoidable, but it certainly is not. Within a method you can easily call another method with perhaps similar functionality.

Let's look at this through an example. Suppose you have created these overloaded methods:

```java
public void printLine(String sentence) {
    // Do fancy stuff to get the sentence on the screen....
}

public void printLine(int number) {
    // Do highly similar fancy stuff to get the number on the screen...
}
```

Then, of course, you can choose to have one method use the other! This looks like this:

```java
public void printLine(String sentence) {
    // Do fancy stuff to get the sentence on the screen....
}

public void printLine(int number) {
    String numberInStringFormat = "" + number; // Convert number from type int to a String
    printLine(numberInStringFormat); // Call the printLine method that takes a String and let it handle this printLine!
}
```
The big advantage of the above solution is that now you only have your "fancy code" in 1 place,
namely in the `printLine(String)` method. So if there is a mistake in `printLine(..)` (or you want to change things), you only need to do this in 1 place. This kind of solution is very often used in programming and it is good to start thinking about it from now on: avoid code duplication!

Finally, 1 more example to show how overloading can be used in a slightly different setting:

```java
public void print(Person p) {
    // Do something fancy... 
}

public void print(ArrayList<Person> persons) {
    for(Person p:persons) {
        print(p); // Invoke the print(Person) method
    }
}
```

This way you can e.g. combine a list of objects of a certain type, easily with the method that can only handle 1 instance at a time!

### Overloaded constructors

In addition to methods, you can also overload constructors. This is useful if you (for example) want to include default values and
do not always want to include them. Consider the following example:

```java
public class TrainCompartment {
    private int numberOfSeats;
    private int numberOfSeatsInUse;

    public TrainCompartment(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;

        numberOfSeatsInUse = 0; // This line is a duplicate!
    }

    public TrainCompartment() {
        this.numberOfSeats = 50; // Default value!

        numberOfSeatsInUse = 0; // This line is a duplicate!
    }
}
```

By adding two constructors to this class, it has suddenly become possible to instantiate the class `TrainCompartment`
in two ways, namely:

```java
TrainCompartMent tc1 = new TrainCompartment();
TrainCompartMent tc2 = new TrainCompartment(100);
```

The difference, of course, is in what happens next to the internal state of `TrainCompartment`. `tc1` will in this case have the default 50 seats, `tc2` will be provided with 100 seats. So now the choice is up to the programmer: You may choose your own number of seats or opt for a default solution!

There is still a sloppiness in the above elaboration! This is because there is double code included which we still want to get rid of. (In this case it is only 1 line, but in the future there may be many more). In the case of constructors, to call another constructor you must use the word `this(...)`. This is because you don't have a method name that you can use for a while now.
This looks like this:

```java
public class TrainCompartment {
    private int numberOfSeats;
    private int numberOfSeatsInUse;

    public TrainCompartment(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;

        numberOfSeatsInUse = 0; // This line WAS a duplicate!
    }

    public TrainCompartment() {
        this(50); // Invoke the other constructor that requires an integer, providing 50 (the default value) as an argument.
    }
}
```

This way we can easily overload constructors, without getting code duplication in the process!

## Using composition

Because we can now give classes more responsibilities, we can also start thinking about a more complex structure
of our programs. As an example, we are therefore going to elaborate on an assignment from last week (assignment 1, the train set). 
We are going to use the class `TrainCompartment` to write a complete class `Train`. After all, it is quite
conceivable that if your passenger wants to "get on the train", you may need to find a seat and for that you will need
go through several `TrainCompartment`s. A `Train` thus contains a list of `TrainCompartment`s. In OOP, this is called *composition*.

In doing so, it is not inconceivable that the method `enter()` that you created earlier for the class `TrainCompartment` could also
be useful for the entire train. After all, you usually want to have a seat "on the train" and not
be limited exclusively to 1 train set. So we choose to include an `enter()` method in the class `Train` as well.

Consider the following `Train` implementation:

```java
public class Train {

    ArrayList<TrainCompartment> compartments;

    public Train(int nrOfCompartments) {
        compartments = new ArrayList<>();

        // Initialize compartments
        for (int i = 0; i < nrOfCompartments; i++) {
            TrainCompartment newCompartment = new TrainCompartment();

            compartments.add(newCompartment);
        }
    }

    public void enter() {
        for (TrainCompartment tc : compartments) {
            if (!tc.isFull()) { // If there is room in the compartment.
                tc.enter(); // Enter it.
                break; // Stop the loop: We found a seat!
            }
        }
    }

    // Omitted other code.
}
```

(Note that we did add a helper method `isFull()` in the class `TrainCompartment` that checks whether there is still room
in this train compartment).

We now use the `TrainCompartment` class as a building block to create our entire `Train`. We now also speak
of the fact that the `TrainCompartment` objects are now *contained* within the `Train` objects. The class `Train` is composed of 
one or more `TrainCompartment`s, and has become dependent on this class. 

By adding the `enter()` method it is now possible (as a passenger/user of the class `Train`) to
more easily find a place in the entire train. After all, the `Train` class has now become responsible for
finding a place in the train where a passenger can take a seat. (So actually, you don't have to provide a getter anymore
for the variable compartments).

But what if there is no place? And can a train also have *no* compartments? Still, things can go wrong
and at the moment we solve these errors mainly by _printing_ an error message to the user. But there is also a
way in which we can deal with errors programmatically, a way in which we can indicate in our code
that something is going wrong and then what to do to fix it.

For this, most object-oriented programming languages have come up with a similar solution: _Exceptions_.

## Error handling: Exceptions

_Exceptions_, and _exception handling_: is the way in which within programming, errors are handled on a code-by-code basis. So no longer are we just going to print error messages to the user, but really make sure that our program also knows that an error has occurred. An exception is best seen as "an error" (or a problem) that needs to be solved in a certain way or your application might crash. If an error occurs somewhere, then an exception is thrown. After an exception is thrown, it must also be resolved somewhere, also called _catching an exception_. "Throw" and "catch" are the terms you will encounter a lot here and in this chapter we will explain what they mean.

### Throwing Exceptions

Let's start right off with an example, using the `TrainCompartment` set up earlier. Take a look at the following
code:

```java
public class TrainCompartment {
    private int numberOfSeats;
    private int compartmentClass;
    private int numberOfSeatsInUse;

    // Cut out some code...

    public void enter() {
        if (numberOfSeatsInUse < numberOfSeats) {
            numberOfSeatsInUse++;
        } else {
            // Produce some kind of error!
            SaxionApp.printLine("The compartment is full!");
        }
    }

    // Cut out some more code...
}
```

In the above snippet, you can see the `enter()` method that checks if there is room in this traincompartment. If this is not
the case, an error message will be displayed. For the user, this is certainly nice, but for your program, after the error message is printed, the `enter()` method will continue and actually it will appear as everything is okay: Nothing has gone wrong in the code!

If we also want our software to really "throw" an error that we as a programmer can respond to further,
we have to throw an exception. Throwing an exception breaks the output of a method (the method is not completed) and a message is sent to the calling method. This looks like this:

```java
public void enter(){
    if (numberOfSeatsInUse<numberOfSeats) {
        numberOfSeatsInUse++;
    } else {
        // Produce some kind of error!
        throw new IllegalStateException("There are no more seats available!");
    }
}
```

Note that the word `throw` is actually a _keyword_ in Java, just like _if_ and _for_, etc. The purpose of
_throw_ is to actually "throw" an error message. An exception itself is really just a class within
Java with several subtypes (we'll come back to this later), but when you want to start throwing the exception, you throw
a normal object just like `Train` and `TrainCompartment`. So the word `new` is mandatory to instantiate an exception.
So you throw each exception in the following way: `throw new <NameOfException>`. The constructor of
class IllegalStateException allows us to pass a message (in String form) so that it can be printed later.
can be printed later. In addition, you never throw a standard exception, but always try to make it as specific as possible.
We will come back to this later.

For this week's assignments, you use 2 possible exceptions:

* `IllegalStateException` This error message is thrown when your program/object has reached a state
  which means that the method should no longer be called. In the case of the previous example, this exception
  is thrown to indicate that the train is full and there are no more seats available. You use this exception as follows:
  ```java
  // At the place you found a problem, use:
  throw new IllegalStateException("You can provide a message here!");
  ```
* `IllegalArgumentException` You may throw this error message if the parameter of your method call is invalid. Think
  e.g. back to the class person with a `setAge(int age)` method, where you enter a negative age. This is
  a value that does not make sense (go figure: what is a negative age?) and so it deserves an error message.
  ```java
  // Whenever you conclude a provided argument is illegal
  throw new IllegalArgumentException("You can provide a message here!");
  ```

A possible `IllegalArgumentException` is also hidden in our train example, just look at the constructor:

```java
public Train(intOfCompartments) {
    compartments=new ArrayList<>();
  
    // Initialize compartments
    for(int i=0;i<nrOfCompartments; i++) {
        TrainCompartment newCompartment=new TrainCompartment();
  
        compartments.add(newCompartment);
    }
}
```

If we decide that it is not allowed to have no compartments (so `nrOfCompartments > 0` must apply), then
we can throw an _IllegalArgumentException_ in the event that it does not. The updated constructor can look like this:

```java
public Train(int nrOfCompartments) {
    if(nrOfCompartments<=0) {
          throw new IllegalArgumentException("nrOfCompartments must be > 0!"); // If this exception is thrown, the constructor will end.
    }
  
    compartments=new ArrayList<>();
  
    // Initialize compartments
    for (int i=0;i<nrOfCompartments; i++) {
        TrainCompartment newCompartment=new TrainCompartment();
    
        compartments.add(newCompartment);
    }
}
```
Note that if the IllegalArgumentException is thrown, the constructor will actually abort and no instance is created.

### Catching Exceptions
Once you throw one of the two exceptions mentioned above, you often want to deal with them. You must imagine
that an exception is "thrown" from method to method. Suppose that a `run()` method
calls the `enter()` method, then the exception (when thrown) will be thrown from `enter()` to `run()` (up the call stack)
In the `run() ` method, you can then decide to either catch the exception or let it pass. In the
latter case, the method that calls the `run()` will have to handle the exception. For now, we are going to catch exceptions
immediately when they are thrown.

Given the `enter()` method above, you can catch the exception that is (potentially) thrown as follows:

```java
public void run(){
    Train myTrain = new Train();

    try{
        myTrain.enter(); // This method could potentially "throw" an exception, so we are going to TRY it and possibly catch the exception!
    } catch (IllegalStateException ise) {
        SaxionApp.printLine(ise);
    }
}
```

Literally you may read the above code as: _Try to execute the ... method and IF an exception is
thrown, catch it and give it the name "ise" and then print out the error message stored in that Exception._

**Note** especially that the method call `enter()` is now included in a new construction that looks as `try {... } catch(IllegalStateException ise)`. The curly braces are used to indicate blocks of code, similar to if-statements and loops. The `catch (..)` block is used as a catchall for any error messages generated from the code after `try { ... }`. The code you add in the catch block is only executed if an exception is actually caught.
For all curly braces, you may of course write more lines of code. After all, the name "ise" for the exception is freely chosen, but is derived from the <ins>I</ins>llegal<ins>S</ins>tate<ins>E</ins>xception.

For an IllegalArgumentException, the same goes, but you write `catch (IllegalArgumentException iae)`. After all, in the catch block you must specify exactly what kind of exception you expect to receive.

## Videos

[![Constructor overloading](http://img.youtube.com/vi/nYl8gVKBWhM/0.jpg)](http://www.youtube.com/watch?v=nYl8gVKBWhM)
[![IllegalArgument and IllegalStateExceptions](http://img.youtube.com/vi/mvfWfXplLPU/0.jpg)](http://www.youtube.com/watch?v=mvfWfXplLPU)

## Larger demo
Let's have another look at the train example and this time we'll try to make it even better. We'll only show you the solution,
it's up to you to study it and make sure you understand why and how we make certain things possible. If you have questions with
regards to the code, let us know!

Passenger.java
```java
public class Passenger {
  private String name;

  public Passenger(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
```

TrainCompartment.java
```java
public class TrainCompartment {
    private int numberOfSeats;
    private int compartmentClass;

    private ArrayList<Passenger> listOfPassengers;

    public TrainCompartment(int nrOfSeats, int compartmentClass) {
        if(!(compartmentClass == 1 || compartmentClass == 2)) {
            throw new IllegalArgumentException("Compartment class cannot be anything other than 1 or 2");
        }
        
        if(nrOfSeats <= 0) {
            throw new IllegalArgumentException("nrOfSeats must be at least 1");
        }
        
        this.numberOfSeats = nrOfSeats;
        this.compartmentClass = compartmentClass;

        listOfPassengers = new ArrayList<>();
    }

    public TrainCompartment() {
        this(50, 2);
    }

    public boolean isFull() {
        return listOfPassengers.size() < numberOfSeats;
    }

    public void enter(Passenger somePassenger) {
        if (isFull()) {
            throw new IllegalStateException("The compartment is full!");
        }

        listOfPassengers.add(somePassenger);

    }

    public int getNumberOfSeatsInUse() {
        return listOfPassengers.size();
    }

    public void leave(Passenger somePassenger) {
        if(!hasPassenger(somePassenger)) {
            throw new IllegalStateException("This passenger is not in this compartment!");
        }

        listOfPassengers.remove(somePassenger);
    }

    public boolean hasPassenger(Passenger somePassenger) {
        return listOfPassengers.contains(somePassenger);
    }

    /**
     * Instead of returning the actual list (that can be manipulated), we'll just return a list of names!
     * Alternatively, we could return a copy of listOfPassengers. We just want to keep our data safe!
     * @return a list of all passenger names.
     */
    public ArrayList<String> getListOfPassengerNames() {
        ArrayList<String> result = new ArrayList<>();

        for(Passenger p : listOfPassengers) {
            result.add(p.getName());
        }

        return result;
    }

    @Override
    public String toString() {
        return "There are currently " + getNumberOfSeatsInUse() + " seats in use out of a total of " + numberOfSeats + " on the train compartment with class " + compartmentClass + ".";
    }
}
```

Train.java
```java
public class Train {

    ArrayList<TrainCompartment> compartments;

    public Train(int nrOfCompartments) {
        if(nrOfCompartments <= 0) {
            throw new IllegalArgumentException("nrOfCompartments cannot be less or equal to 0");
        }

        compartments = new ArrayList<>();

        // Initialize compartments
        for (int i = 0; i < nrOfCompartments; i++) {
            TrainCompartment newCompartment = new TrainCompartment();

            compartments.add(newCompartment);
        }
    }
    
    public Train() {
        this(5);
    }

    public void enter(Passenger somePassenger) {
        for (TrainCompartment tc : compartments) {
            if (!tc.isFull()) { // If there is room in the compartment
                tc.enter(somePassenger); // Enter it..
                break; // Stop the loop: We found a seat!
            }
        }
    }

    public void leave(Passenger somePassenger) {
        for (TrainCompartment tc : compartments) {
            if (tc.hasPassenger(somePassenger)) { // If the passenger is in that compartment
                tc.leave(somePassenger); // Remove the passenger from the compartment.
                break; // Stop the loop: The passenger got off the train
            }
        }

        // We won't report an error if the passenger was never on board: We'll just ignore it.
    }
}
```
