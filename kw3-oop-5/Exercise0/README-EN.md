# Calculations
## Difficulty: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) ![Outlined](../resources/star-outlined.svg) 
In this assignment we are going to practice with abstract classes and abstract methods. We are going to write classes for calculating with two numbers (doubles).
The superclass we need is called `Calculation`. This class is created with two numbers (value1 and value2) for which 
of course you use the constructor. The class also has an abstract method `double calculate()` which needs to be implemented in the 
to be implemented in the subclasses.

There are four classes that inherit from the `Calculation` class:
- `SumCalculation`: this class adds the two numbers together.
- `SubtractCalculation`: this class determines the difference between the two numbers.
- `MultiplyCalculation`: this class multiplies the two numbers.
- `DivisionCalculation`: this class divides the two numbers (note that dividing by 0 is not allowed and should be handled in your code).

## Example
Implement the superclass and the subclasses. If you run the example program, the result should look like this:

![Example](sample_output.png)

## Relevant links
* [Java documentation for the SaxionApp](https://saxionapp.hboictlab.nl/nl/saxion/app/SaxionApp.html)
