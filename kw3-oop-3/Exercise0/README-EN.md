# Buildings
## Difficulty: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) ![Outlined](../resources/star-outlined.svg) 

In this assignment, you're going to practice _inheriting_ between different classes. We are going to build an inheritance structure where we store common attributes in a super class and store the specific attributes in the classes themselves.

In the application we are going to build, there are two types of buildings: houses and offices. Of each building we need to store: the address, the zip code and the area in square meters. These attributes cannot be changed once they are set. However we should be able to get this information from each object.

A house is a building with a number of additional attributes. For a house we'll store: the name of the owner, whether the house has a garage (or not) and the price of the house (in euros). The owner of a house can change. The other attributes must remain the same and, once set, cannot be changed. Obviously, we need to be able to read the data.

Finally, there is an office. This is a building, completed with the following attributes: the name of the company housed there and the number of employees working there. The company name and the number of employees must be adjustable.

Implement the various classes and create a `toString()` method in each class, so we can easily print the buildings. Create (where necessary) constructors, getters and setters.

## Hints:
- Start with the superclass and make sure all necessary properties, getters, setters and constructors are present.
- Build the subclasses one by one.

## Relevant links
* [Java documentation SaxionApp](https://saxionapp.hboictlab.nl/nl/saxion/app/SaxionApp.html)
