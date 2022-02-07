# Number guessing game (again)
## Difficulty: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) ![Outlined](../resources/star-outlined.svg) 
We are going to build the number guessing game (again) by only using classes that are in the default Java library. Thus, 
it is not allowed in this assignment to use the SaxionApp.

In this number guessing game, first the computer selects a random number between 0 and 100. Then the user is prompted to
guess what the number is. The computer provides feedback after each attempt. There are three possible responses that
computer can give:
- Higher: your entered number is too low.
- Lower: your entered number is too high.
- Guessed: your entered number is the number we were looking for!

The computer keeps track of how many turns it took you to guess the correct answer. At the end of the game the computer 
will ask if you want to play again. If you answer yes, the game will be repeated, if the answer is no, the program will 
terminate.

## Example
This is what your program could look like. Please note that this should all be done via the IntelliJ console!

```text
*************************************************
*** Higher! Lower!                            ***
*************************************************
Please guess a number: 40
Too low!
Please guess a number: 60
Too high!
Please guess a number: 50
Too low!
Please guess a number: 55
Too high!
Please guess a number: 53

Good job! The correct answer was 53!
You needed 5 turns to guess the correct answer.

Do you want to play again? (y/n): y

*************************************************
*** Higher! Lower!                            ***
*************************************************
Please guess a number: 50
Too high!
Please guess a number: 30
Too high!
Please guess a number: 10
Too high!
Please guess a number: 5
Too high!
Please guess a number: 3
Too high!
Please guess a number: 1

Good job! The correct answer was 1!
You needed 6 turns to guess the correct answer.

Do you want to play again? (y/n): n

Process finished with exit code 0
<<<<<<< HEAD
```
