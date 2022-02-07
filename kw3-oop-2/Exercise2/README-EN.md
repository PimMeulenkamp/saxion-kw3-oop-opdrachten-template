# Validation
## Difficulty: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) ![Outlined](../resources/star-outlined.svg) 

In this assignment you are going to practice throwing and catching (Runtime) Exceptions.
We are going to implement a `Person` class where several checks need to be performed as soon as a setter is called.
If the values that are passed in do not meet the requirements, an `IllegalArgumentException` will have to be thrown.

In the Application class we will test the code and catch any errors thrown! One example of how to handle errors has already been given.

#### Validation
The following methods are available in the person class. For each method, it is indicated how to validate the parameters:

|Method|Explanation|
|---|---|
|`setAge`|The person's age can never be below 0, nor can it be greater than 150.|
|`setZipcode`|We are going to validate Dutch postal codes: first 4 digits, then 2 letters (for example 1234AB). We assume that there is no space between numbers and letters.|.
|`setPhonenumber`|We are validating Dutch phone numbers: there are 10 digits in total of which the first digit must be a zero. There are no constraints for the other 9 digits.|

#### Hints
You can use the methods: `Character.isLetter()` and `Character.isDigit()` from the java library to check whether a `char` is a digit or a letter.

#### Tests
Study the given tests for age testing. Now build your own test methods to test the other validation methods.

## Relevant Links
* [Java documentation of the SaxionApp](https://saxionapp.hboictlab.nl/nl/saxion/app/SaxionApp.html)
* [Java documentation Character class](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Character.html)


