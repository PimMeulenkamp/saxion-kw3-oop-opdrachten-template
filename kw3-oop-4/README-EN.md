# Polymorphism
Competence: _I understand the concept of polymorphism and can use superclasses to create different data types in the 
same way_

The commands are in the individual modules.

## Introduction
This week we are looking at the following probe of object-oriented programming: _polymorphism_.

Polymorphism literally means: something can have multiple forms. Within programming you have seen and used this many 
times in recent weeks: you have written a class `Person`, which is then used as a base for the classes `Student` and 
`Teacher`. If you then create a `Teacher` object, you have an object that is actually a `Person`, with a small addition 
to make it a `Teacher`. 

In this case, we speak of an object that actually has multiple faces (shapes): it is both a `Teacher` and also a 
`Person`. Of course, the same goes for our other example: `Student`. A `Student` is also a `Person`. As students and 
teachers are therefore both also persons it is possible to write code that applies to both types (or better: for the 
type of "Person"). The possibility that you can also treat a class (e.g. `Student`) as a different class (e.g. `Person`) 
is called polymorphism.

This technique is particularly powerful, because it allows you to use certain types (based on a superclass) in a
common way. This prevents code duplication and increases the reusability of your code. 

However, you will have to do something for this; Java, for example, cannot easily tell what type an object is 
and during your programming you will have to pay attention to this. And that is exactly the subject of this 
week!

## Polymorphism
Everything in Java has a type. You learned this from the moment you started programming in Java. You have variables
made of the type `int`, `double`, etc. (what we call the primitive types), but soon we started to add our own data types 
in the form of `Person`, `Artist`, `Album`, etc. So far, however, we have always pretended that a variable could only 
have 1 type and actually that's just not true. All _reference types_ in Java are polymorphic, which means that they can 
take multiple forms. For example, all classes within Java already inherit by default from the `Object` class, resulting 
in that each class you build yourself actually already has 2 types.

In the event of inheritance, we introduced some additional options. In addition to the classes `Teacher` and `Student`, we 
introduced also a class `Person` in which common functionality could be included. This addition meant  `Student` is now 
_also_ a `Person` (and indirectly still _also_ an `Object`). So if an object is a `Teacher` you can therefore treat it 
in different ways: as a `Teacher`, but also as a `Person` or even a `Object`.

(Note that usually the opposite does not apply: a teacher is always a person, but not all people are teachers!)

Given is the following code for the classes `Person`, `Student` and `Teacher`:

```java
public class Person {
 private String firstName;
 private String lastName;

 public Person(String firstName, String lastName) {
  this.firstName = firstName;
  this.lastName = lastName;
 }

 // Omitted getters / setters
}
``` 

```java
public class Student extends Person {

    private int studentNumber;

    public Student(String firstName, String lastName, int studentNumber) {
        super(firstName, lastName);

        // Omitted checks on student number
        this.studentNumber = studentNumber;
    }

    // Omitted getters / setters
}
```

```java
public class Teacher extends Person {

 private String code;

 public Teacher(String firstName, String lastName) { 
     super(firstName, lastName);
     
     code = generateCode(firstName, lastName); // Converts "Tristan Pothoven" into "TPO" -- Omitted as this is an exercise.
 }

 // Omitted getters / setters
}
```

So far, we have always used these classes by:
```java
Student regularStudent = new Student("Some", "Student", 1234567);

Teacher regularTeacher = new Teacher("Tristan", "Pothoven");
```
And that's fine, of course. We define a new variable of the type `Student` or `Teacher` and instantiate an object
of the same type (and connect it to a variable). But there's another way. We can also use previous code
rewrite and store both types of individuals in variables of the same type:

```java
Person regularStudentAsPerson = new Student("Some", "Student", 1234567);

Person regularTeacherAsPerson = new Teacher("Tristan", "Pothoven");
```

In this case, we use the fact that a `Student` is also a `Person`. Doesn't this make sense? _"A student is also a person."_

However, saving a `Student` instance as a `Person` variable does have consequences: in your program,
students (and also teachers) are now really considered instances of the `Person` class, with the result that all extensions 
you have added to the subclasses (e.g. requesting the student number from a student or the teacher code to a teacher) 
is now **no longer possible**. The variables are **not** of the right type to invoke those methods. (However, the content data 
of a `Teacher` or `Student` is stored well. So you don`t have to worry that information is lost.)

This can also be seen if you try to type this into the IntelliJ IDEA editor. Study the following screenshots:

![No getter](resources/limited-public-interface.png)

Please note that the image above shows **no** `getStudentNumber()` method in `regularStudentAsPerson`, because 
this variable refers to a "Person" object and a `Person`object has no student number!

Fortunately, this problem is easy to solve: it is possible to select a variable of the type `Person` that 
actually refers to a `Student` instance to convert to its student form again. We'll get back to you on this later.

Because we can now store both teachers and students as `Person` objects, this has many benefits for our future code. You 
can use this technique in all kinds of places, such as methods (as an argument and as a return type), but perhaps the 
best example can be found in lists.

See the example below in which we use an ArrayList to store people:

```java
Person regularStudentAsPerson = new Student("Some", `Student`, 1234567);
Person regularTeacherAsPerson = new Teacher("Tristan", "Pothoven");

ArrayList<Person> listOfPersons = new ArrayList<>(); Note the Person type!

listOfPersons.add(regularStudentAsPerson); A student is also a person!
listOfPersons.add(regularTeacherAsPerson); A teacher is also a person!
```

By having the ArrayList now save the type `Person`, we get the opportunity to store *all* people, regardless of whether 
they are students or teachers, in the same list. Of course, it still depends on the purpose of the program whether 
you would want this (sometimes using 2 lists is more convenient), but the possibility exists.

For completeness: it is not necessarily necessary to create the variables of the type `Person`. The compiler is capable 
of finding out that the class `Student` is also a subclass of `Person`. The code below is therefore equal to the example 
above (but for clarity we show both versions).

```java
Student regularStudent = new Student("Some", `Student`, 1234567); //Note that we do not store this as Person!
Teacher regularTeacher = new Teacher("Tristan", "Pothoven"); //Note that we do not store this as Person!

ArrayList<Person> listOfPersons = new ArrayList<>(); //Note the Person type!

listOfPersons.add(regularStudent); //A student is also a person!
listOfPersons.add(regularTeacher); //A teacher is also a person!
```

Because we can now store teachers and people in the same list, we can easily invoke methods on _all_ known persons in the 
system (e.g. by using a single loop to traverse people instead of having to loop through separate lists). However, the 
real benefit of polymorphism like this can be found in the expandability of our system. 

We consider an (extreme) example: in addition to the classes `Teacher` and `Student`, we also introduce the classes 
`Employee`, `PartTimeStudent`, `FullTimeStudent`, `Manager` and `ProjectLeader`, each of which inherits from the class 
`Person`. (We`re not going to implement these classes for now.)

Because we use a list of `Person` instances in our program, these new subtypes of `Person` can be used immediately: there 
is no need to make any adjustment to our code or to the _listOfPersons_ which will accept these new types. So 
it is still possible to save _all persons_ in this list! As long as the classes inherit from `Person` this solution 
continues to work. And this principle, that you do not make any adjustments to your software if you expand it further, 
one of the strengths of object-oriented programming is: It makes further development of the system a lot easier!

## Casting
As previously mentioned, using superclasses to bundle certain types together also has some drawbacks. The main
is that you lose access to all extensions that you have added to the class (e.g. the student number or 
teacher code). Normally speaking however, this is not a problem, as a superclass never has more functionality than a 
subclass.

However, you can always "force" a class with a certain supertype in a variable of a particular subtype by 
casting it. You have previously seen to turn a `double` value into an `int`:
```java
double someDouble = 2.5;
int valueFromDouble = (int) someDouble; this will result in "2" as everything after the comma is dropped.
```

The construction `(<type>)` is called _casting_ and with that you force the compiler to treat a object with a specific
type as a different type; You're actually saying to the compiler, "Trust me, I know what I'm doing." 
Note that casting a subclass to a superclass is not necessary, because the subclass **is** is always the 
superclass i.e. a `Student` instance has all the variables / methods that a `Person` has (and more). So you don't ever 
have to cast a `Student` variable into a `Person` variable.

Casting can therefore be used as follows in our previous example of people, students and teachers:
```java
Person regularStudentAsPerson = new Student("Some", `Student`, 1234567);

Student regularStudent = (Student) regularStudentAsPerson; Convert the type from Person back to Student.
```

The variable `regularStudent` has now been "restored" as it were and all the functionality of the class `Student` is 
now available to use. You can also read the previous example as _try to convert the regularStudentAsPerson object
to a regular Student object_.

![Regular behaviour](resources/normal-public-interface.png)

However! Casting is not safe. You may have already read the word "try" in the previous sentence; This was for a reason. 
Casting allows you as a developer to apply smart tricks, but the compiler assumes that you know what you are doing.
So if there are no good checks on converting types, casting can really go wrong. Take, for example, the following code:

```java
Person regularTeacherAsPerson = new Teacher("Tristan", "Pothoven"); //Note that we initialize a Teacher instance, but store it as `Person`.

Student someStudent = (Student) regularTeacherAsPerson; //Convert the type from Person to Student.
```
In terms of syntax, this is completely valid and you won't get any compilation errors on it either. This is because you gave 
the Java compiler the command to convert the type of an object and Java will always try to do so! However, 
during the execution of the program, the program will discover that this is not possible and crash your program with a `ClassCastException`:

![ClassCastException](resources/class-cast-exception.png)

You may consider this error message as a notification _that it is not possible to cast_ a Student object to a
Teacher object. This also makes sense! After all, a student does not have a teacher's code, and a teacher does not have 
a student's number. 

IntelliJ as a tool is fortunately quite smart and will help us to find these types of errors, but it cannot indicate 
for all situations. (Especially if you`re going to use methods in different classes.) So always trust your own instincts. 

![IntelliJ warning](resources/class-cast-warning-by-IntelliJ.png)

It's up to you as a programmer to make sure that if you want to convert a type, that this is possible.

Fortunately, we can easily check types before casting that is what the next paragraph is about.

## Distinguish between types: instanceof
To check if an object is of a certain type, Java has the keyword `instanceof`. You can use this keyword in an 
if-statement. The syntax might be a little different than you are used to: `<object> instanceof <type>`. Let`s 
take a look at this in an example:

```java
Person regularTeacherAsPerson = new Teacher("Tristan", "Pothoven"); //Note that we initialize a Teacher instance, but store it as `Person`.

if (regularTeacherAsPerson instanceof Teacher) {
        //It`s safe to cast to a Teacher instance!
        Teacher regularTeacher = (Teacher) regularTeacherAsPerson;
} else {
    //Don't do it! ClassCastException is waiting!
}
```
This example is of course a bit lame, but consider the following example now. 

What if we run a zoo? With different types of animals. In this program we have defined classes such as `Lion`, `Elephant`, `Giraffe`, ...

Because these classes of course have quite a lot of common functionality, we build a class `Animal` to prevent code 
duplication. However, the data for these animals all comes from the same database and during reading all these animals 
are then stored in 1 large list: `ArrayList<Animal> listOfAllAnimals`.

Check out the following code:

```java
public void run() {
    ArrayList<Animal> listOfAllAnimals = readAnimalsFromDB(); //Don`t worry how this is done..
        
    for(Animal a : listOfAllAnimals) {
        Do something with this animal..    
    }
}
```

In the above loop, it is impossible to call methods specific to a particular species. Only
methods defined in the `Animal` class can now be used. Should we now want animal-specific methods
we're going to have to cast. However, this comes with a risk, so we will have to use `instanceof` to make sure
that we can cast safely. This could look like this:

```java
public void run() {
        ArrayList<Animal> listOfAllAnimals = readAnimalsFromDB(); //Don't worry how this is done..

        for(Animal a : listOfAllAnimals) {
            if(a instanceof Lion) {
                //Give it some meat!
                Lion l = (Lion) a;
                a.giveMeat(..); //giveMeat(..) is a specific method for Lion`s (or meat eating animals).
            } else if(a instance of Giraffe) {
                //Give it some hay or bamboo!
                Giraffe g = (Giraffe) a;
                a.giveVeg(..); //giveVeg(..) is a specific method for Giraffes (or vegetable eating animals).
                //Also, let`s measure the length of its neck!
                a.getNeckLength(..); //This might also be a specific method for Giraffes.
            } else if(...) { ... }
        }
}
```
## Method overriding: which method is called?
Last week we also introduced in inheritance that you can _override_ methods. 

In the case of polymorphism, this gives an interesting problem: suppose you have defined a method in a
superclass, but it has _overriding_ in a subclass. Take, for example, the following toString construction:

```java
public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
```

```java
public class Teacher extends Person {

    private String code;

    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);

        code = generateCode(firstName, lastName); Converts "Tristan Pothoven" into "TPO" -- Omitted as this is an exercise.
    }

    @Override
    public String toString() {
        return super.toString() + " (" + code + ")";
    }
}
```

What happens if you execute the following code:
```java
Person somePerson = new Teacher("Tristan","Pothoven");

SaxionApp.printLine(somePerson.toString()); //Added .toString() to make clear we're looking at that method, it's not required.
```

You may expect to only see "Tristan Pothoven" now, as this is the `toString()` method that is linked
is up to the Person class. However, you will see the following result:

![toString example](resources/toString-dynamic-method-lookup.png)

This is the `toString()` defined by the class `Teacher` and is the result of something that is in Java known as _"dynamic method 
lookup"_.

In the case of polymorphism, a method calls _the most specific implementation_ of a method. 
In addition, it is important to know that it is **not** the type of variable (in this case `Person`) that determines 
which method but the type of the actual object (in this case: `Teacher`). So you can treat a `Teacher` as a person, but 
it remains a teacher (it's like the real world!).

The nice thing about this way of working is that the idea of inheritance is preserved: You can easily create a subclass 
for your own implementation that deviates from its superclass(s) and **also** treat them in the same way. Java takes care of it 
itself that the correct version of a method is called, regardless of the type of variable to which the object is attached.

# Videos

The first video is about casting and the use of `instanceof`. The video talks about an *abstract* class. This will be 
covered next week, and you can ignore it for now.

[![InstanceOf and Casting](http://img.youtube.com/vi/DfFet4Qb4jU/0.jpg)](http://www.youtube.com/watch?v=DfFet4Qb4jU)

The video below is about designing (and writing down) classes and their relationships. The video is from our archives 
and talks about an exercise that is no longer part of the course. THe principles of design and how you should write 
down your design hasn't changed however.

[![OO Design](http://img.youtube.com/vi/ibpJ1bw1k2w/0.jpg)](http://www.youtube.com/watch?v=ibpJ1bw1k2w)