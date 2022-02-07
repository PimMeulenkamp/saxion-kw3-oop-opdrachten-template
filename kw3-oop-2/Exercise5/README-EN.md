# Yathzee
## Difficulty: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg)

We are going to build an application that allows us to roll 5 dice. We are going to visualize the dice by drawing them on the canvas.
In the last part of the assignment you are going to determine which combination was thrown. Look for the combinations of Yatzee [here.](https://nl.wikipedia.org/wiki/Yahtzee)

#### Implementation
We need two classes for this assignment: a class Yathzee and a class Dice.
Create a class Dice with a `roll()` method that returns a random number from 1-6.
Next, create a Yathzee class that creates 5 dice.
Implement the `roll()` method that returns an integer array containing the results of the 5 rolls. 

#### Visualization
Create a `draw()` method in the Yathzee class that allows all dice to be drawn.
Hint: create a `draw(int x, int y, int width)` method in the Dice class that can draw one die at a given location.  

#### Determine Combination ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) (![Filled](../resources/star-filled.svg)) 
Implement the `determineCombination(int[] diceOutcomes)` method that returns a String indicating the highest possible combination.

Note: This is a tricky exercise. Start by doing the most simple of cases and work towards the more complex ones.

#### Testing
Try to write your own tests for this application. We have provided some skeleton tests for you, but they are from finished!

## Relevant Links
* [Java documentation of the SaxionApp](https://saxionapp.hboictlab.nl/nl/saxion/app/SaxionApp.html)