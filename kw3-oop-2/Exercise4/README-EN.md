# A plane with passengers
## Difficulty: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg)

Create a program that lets you board people in an airplane. We've already prepared some things for you here so you don't have to build everything from scratch. You are supposed to build the class `Airplane`.

The following rules apply for this program:
* An airplane has a maximum number of persons that can be taken along and a maximum weight of luggage that can be carried.
    * The number of people must be entered when creating an `Airplane`, but may not be changed after creating an Airplane instance.
    * Each person takes a certain amount of luggage that must also be carried on the plane. Each person takes 0-3 bags in which this weight is distributed. It is important that the plane does not exceed the maximum weight (what it can carry). This maximum is 25 kg * the number of people that fits in the plane. (So with 40 people on the plane, a maximum of 1000 kg of luggage can be carried).

Now write the full implementation of the program, focusing on adding the following functionality:
* You must be able to close (`lockDoors()`) and open (`unlockDoors()`) the doors of an aircraft. Also, you should be able to query whether the doors are locked or not (`hasLockedDoors()`)
* Next, write a method `boardPassenger(Passenger p)` that allows you to seat a particular passenger on the plane.
    * Note that there may be some errors for which either an `IllegalArgumentException` or an `IllegalStateException` should be thrown.
        * An IllegalStateException is thrown if the plane doors are closed when you want someone to board.
        * You throw an IllegalArgumentException if there is no more room for the passenger or if the passenger's luggage causes the maximum weight the plane can carry to be exceeded.
* Write the method `depart()` that allows you to make the plane leave.
    * Again, we expect an IllegalStateException if you try to depart without the doors locked.

To further properly check all situations, we have provided two official test classes to test your model. In class we will discuss the principle of testing better, but with this one you can already see and experiment with the code. So feel free to study them! The tests can become in the `test` folder (under `src`).

## Relevant links
* [Java documentation for the SaxionApp](https://saxionapp.hboictlab.nl/nl/saxion/app/SaxionApp.html)

