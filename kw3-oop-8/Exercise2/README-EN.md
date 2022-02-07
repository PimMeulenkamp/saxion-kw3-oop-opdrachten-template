# Fitness club "Merlin" (45 min)
Fitness club "Merlin" is about to purchase a program that will allow their guests to completely automatically
create their own fitness program, also called a `Routine`. Unfortunately for you, this program needs to be developed
which is the objective of this exercise.

A routine is composed of several individual exercises. There are two types of exercises included in the system: cardio 
and strength exercises. Of each exercise, the _name of the exercise_ and the _duration_ of each exercise is stored. 
Furthermore, of cardio exercise the distance that you should run/swim/etc is recorded. For strength exercises the fact
that it needs to be done rapid (or "high impact") is recorded. Of each exercise you can then calculate how many 
kilocalories you have burned after doing so. Use the following calculation to determine the kilocalories burned:

| Type of exercise        | Calculation           |
| ------------- |:-------------:|
| Cardio     | `duration * 20` |
| Strength (rapid)      | `duration * 15`      |
| Strength (normal) | `duration * 10`     |

(Example: If you swim for 20 minutes (cardio exercise), you will burn 400 kilocalories).

All exercises are recorded in the `exercises.csv` file. This file looks like this:

```text
cardio,swimming,20,0.3
strength,bicep curls,10,false
```

(Explanation: The first "cardio" exercise is called "swimming" and lasts 20 minutes. You should cover 0.3 km in that time. 
The second "strength" exercise is called "bicep curls", lasts 10 minutes and should be performed at a low pace).

In order to determine a good routine, the user should specify the number of minutes that the routine should (approximately)
take. The computer will then randomly add exercises to the routine, filling up to this amount of time. The random select
does not take into account whether an exercise is a strength or cardio exercise, but _an exercise should never occur 
twice in the same routine_. (So nu duplicates allowed!)

Thus, a total routine may well consist of many more cardio exercises than strength exercises (or vice versa). However, 
this is not a problem for this version of the program. Also, the fact that by (automatically) adding exercises to the
routine you may be able to go over the planned time (by just a few minutes) is not a huge problem. 

When displaying the total overview of exercises, all exercises are shown in order of calorie burn: the exercises you 
can use to burn the most calories will be shown at the top of the list!

## Requirements
- You should apply the techniques as taught in this course. (So do use encapsulation, inheritance, etc.)
- Your program should ask for the name of the client and the number of minutes the routine should last (approximately).
- Your program randomly selects exercises and adds those to the routine. You may randomly choose between strength and
  cardio exercises.
  - Note: The same exercise may **not** occur twice in the same routine! (No duplicates allowed!)
- Each exercise has a clear `toString()` implementation which shows the details of the respective exercise.
- The exercises are shown in order of calories burned: the exercises that burn the most calories are at the top.
- The number of strength exercises, and the number of cardio exercises that are in the routine are also displayed.
- The total calories burned is calculated last.

## Example
The interface is kept simple, but shows exactly what you need to implement. Below the example, we've added a little
checklist, so you can be sure you implementing everything as discussed above.

```text
Please enter the clients name: Tristan
Please enter the target time: 60
The routine for Tristan for today is: 
	swimming for 20 minutes, burning 400 kcal (1.0 km)
	rowing for 15 minutes, burning 300 kcal (2.0 km)
	spinning for 10 minutes, burning 200 kcal (2.0 km)
	chest press for 12 minutes, burning 120 kcal (normal)
	bench press for 10 minutes, burning 100 kcal (normal)

Nr of cardio exercises: 3
Nr of strength exercises: 2

Total duration: 67 minutes
Total calories burned: 1120 kcal
```

