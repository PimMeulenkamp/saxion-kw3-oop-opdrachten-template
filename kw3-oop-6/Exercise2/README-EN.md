# Indian dishes
## Difficulty: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg)
Write a program in which you will be quizzed on your knowledge of Indian cuisine and its dishes.

For each round, the computer will select a random dish and the user will be asked what type of dish this is. The user 
answers this question using a list of options shown of which one must be chosen.

However, these options depend on the dataset being used. So, before presenting these options, you should first determine 
which types of dishes there are by going through `indian_food.csv` and looking at column 6 ("course"). (Make a unique
set of items.)

For each correctly answered question, the user gets a point and moves on to the next question. As soon as the user gives 
a wrong answer, the program will terminate. There is no maximum to the number of questions a user can get.

We have attached the file `indian_food.csv` for you with all the data you need.

**Hints:**
- First, build the data structure to store the dishes.
- Create a static method in your data structure to convert a CSV line (or all lines) into an object.

## Example
```text
********** Question 1: **********
Dish name: Navrattan korma
Ingredients: Green beans, potatoes, khus khus, low fat, garam masala powder
<<<<<<< HEAD

What type of dish is described above?
	1. main course
	2. dessert
	3. starter
	4. snack

Please enter a value: 1
Correct! SCORE: 1.

********** Question 2: **********
Dish name: Shrikhand
Ingredients: Curd, sugar, saffron, cardamom

What type of dish is described above?
	1. main course
	2. dessert
	3. starter
	4. snack

Please enter a value: 2
Correct! SCORE: 2.

********** Question 3: **********
Dish name: Sambar
Ingredients: Pigeon peas, eggplant, drumsticks, sambar powder, tamarind

What type of dish is described above?
	1. main course
	2. dessert
	3. starter
	4. snack

Please enter a value: 3
That's WRONG! It was main course. GAME OVER.

Process finished with exit code 0

=======

What type of dish is described above?
	1. main course
	2. dessert
	3. starter
	4. snack

Please enter a value: 1
Correct! SCORE: 1.

********** Question 2: **********
Dish name: Shrikhand
Ingredients: Curd, sugar, saffron, cardamom

What type of dish is described above?
	1. main course
	2. dessert
	3. starter
	4. snack

Please enter a value: 2
Correct! SCORE: 2.

********** Question 3: **********
Dish name: Sambar
Ingredients: Pigeon peas, eggplant, drumsticks, sambar powder, tamarind

What type of dish is described above?
	1. main course
	2. dessert
	3. starter
	4. snack

Please enter a value: 3
That's WRONG! It was main course. GAME OVER.

Process finished with exit code 0
>>>>>>> 15b767d7f6374cb36061abcb026cf1ec9777c9f7
```