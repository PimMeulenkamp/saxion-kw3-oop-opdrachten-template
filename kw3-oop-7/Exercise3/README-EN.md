# Parking garage
## Difficulty: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg)

In this assignment, we are going to model the administration system of a parking garage. Our parking garage has only 
two types of parking spots: for cars and for motorcycles.

The number of spots for cars and, the number of spots for motorcycles can be set during the instantiation of a parking
garage and cannot be altered after it has been set initially.

A car and a motorcycle both have a license plate, a start date/time (the moment they enter the parking garage) and,
an end date/time (the moment they drive away and have paid). As soon as a car or a motorcycle drives away, a parking spot
becomes available for a next customer, but we still store the actual object in our archive so that we can determine 
(in retrospect) what the total earnings are of the parking garage.

The rates for a car and a motorcycle are different:
- Parking with a car costs €2.00 per hour and after 24 hours it is €5.00 per an additional day.
- Parking with a motorcycle costs €0.50 per hour, no matter how long you are parked.

You only have to charge for whole hours. (So, 0-59 minutes parking is free, 60-119 minutes is 1 hour, etc.)
It doesn't matter whether you park during the day or at night, the costs are always calculated in the same way.

If a car or motorcycle wants to enter the parking garage, but the garage is full then a (self defined)
`ParkingGarageException` is thrown.

Make sure the parking garage has methods to:
- allow a car/motorbike to park.
- allow a car/motorbike to exit.
- determine how many cars are currently parked.
- determine how many motorcycles are currently parked.
- determine what total was earned at the parking garage.

To get you started, we have again provided an `Application` class with example code and have given some empty classes
which you of course still have to adjust / complete!

In addition, we have provided a `Simluation` class which contains some tools to easily create some example vehicles. Be 
sure to look at the official Java documentation for the descriptions of the methods we use here if you have any doubts 
what certain code actually does! (Of course, we don't expect you to be able to come up with this kind of code yourself
in this course, but you should be able to understand what we do. So consider it as an example, but also study material.)