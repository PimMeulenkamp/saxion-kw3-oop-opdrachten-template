# The helpdesk software "i-Desk"
## Difficulty: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg)

At larger companies, all employees (users) can get help from the Information technology help desk (I-Desk for short) for
problems related to the IT tools installed in their workplace. In this exercise, we'll create a reporting system to
register these kind of problems. To keep things simple, we'll only focus on registering "hardware" and "software" related
issues. (No more specific issues are required!)

In order to report a problem, the employee must first login to the I-desk system. A user can login
with a previously stored username and password (see `users.csv`). Of course, the system must check that 
the password actually matches the username before a user can log in.

After a user has logged into the I-desk system, that user can report a problem by creating a _ticket_ in which the problem 
(and later: the solution) is recorded. A ticket always has a unique number within the system, a date + time when the
ticket was created and a description. The date and time of the report are automatically recorded in the system when 
creating the ticket. (Note that the imported tickets ALSO have a date and time.) If the problem is about a piece of 
hardware, then the code of the machine must be entered (as a String). In the case the problem is about a piece of 
software, the name of the software package must be entered.

Note that we already have provided some tickets as well for you to import into your system. Have a look at the provided
`tickets.csv` file.

Of course, there are also people who can solve these problems, also called `Troubleshooters`. These are a special
kind of user whose expertise is also recorded and the system tracks for which department these `Troubleshooters` work. 
These `Troubleshooters` can log into the same system and can request an overview of _all_ the problems registered in 
the system. In addition, `Troubleshooters` can also solve problems and thus close the report in the system. If a problem
is resolved and a ticket is closed, the date and time and the involved `Troubleshooter` will be recorded. In order to 
close the ticket, the helpdesk employee briefly indicates how the problem was solved. A helpdesk employee is of course 
also a regular employee of the company and can therefore also register problems himself.

To get you started we have already provided the `Application` class and made an outline of the `Helpdesk` class.  The 
`Application` class contains the interface that you may use for this task. You don't have to alter this class. The task 
is mainly focussed on developing the `Helpdesk` class (and it's required model classes).

Should an error occur in the `Helpdesk` class, you need to throw a self-defined exception known as `HelpdeskException`.
You can determine on where to throw an exception based on our usage in the provided classes.

## Hints
* Start simple: Think about the data models for the users and the `Troubleshooters`. Then start to work on `Ticket`s.
* Work from "version to version". It is fairly easy to lose track in this task, therefore try to take as many small 
  steps as possible.
* The dataset with existing tickets is quite difficult to read (because of the dates). Therefore, start _without_ this
  dataset first and only start reading data when you are ready to do so. You can build the whole system without importing 
  this data first. (The same obviously applies to the existing users as well!)
* In the `Helpdesk` class we have added a `public static final DateFormatter` instance which you can use to easily print 
  out a date and time yourself. You can use this timeFormatter like: `someDateTimeInstance.format(Helpdesk.ticketFormatter)`
  which will return a properly formatted String. (Have a look at the documentation in case of doubts!)
* To round a double to two decimals (e.g. to calculate the number of hours a ticket has been open) you can use the
  use the following "trick":

```java
private double roundOff(double input) {
    return Math.round(input * 100.0) / 100.0;
}
```

# Example
To properly understand this program we have provided you with quite an extensive demo-output. Please take your time
to study this example properly. If you are unsure how to respond in certain situations and we did not provide you
with a clear picture on what to do: Feel free to develop your own solution!

## Logging in as a "regular user"
```text
Read: 15 objects.

-----------
I-Desk
-----------
Please give your username: Tristan
Please give your password: test

-----------
I-Desk
-----------
1. Add ticket
2. Resolve ticket [Troubleshooter only!]
3. Show my tickets
4. Show open tickets [Troubleshooter only!]
5. Show all tickets [Troubleshooter only!]
6. Show users [Troubleshooter only!]
7. Logout
8. Exit

Choice: 3
-----------
Show my tickets:
***** Ticket 3 [RESOLVED] *****
Reported by: Tristan
Reported time: 03-05-2018 08:15:06
Issue: I am stuck at level 15 of Angry Birds

Resolved by: Erik [Troubleshooter] Lecturer, HBO-ICT
Solution: Stop fooling around and get back to work. BTW: touch the screen twice to let the blue birds split.
Solved time: 04-05-2018 11:45:12
Duration: 27.5 hours


-----------
I-Desk
-----------
1. Add ticket
2. Resolve ticket [Troubleshooter only!]
3. Show my tickets
4. Show open tickets [Troubleshooter only!]
5. Show all tickets [Troubleshooter only!]
6. Show users [Troubleshooter only!]
7. Logout
8. Exit

Choice: 1
-----------
Add ticket:
Please enter the type (hardware or software):
hardware
Please enter the description:
My cat destroyed my mouse.
Please enter the machine id:
machine-tpo
New ticket is created with number: 7

-----------
I-Desk
-----------
1. Add ticket
2. Resolve ticket [Troubleshooter only!]
3. Show my tickets
4. Show open tickets [Troubleshooter only!]
5. Show all tickets [Troubleshooter only!]
6. Show users [Troubleshooter only!]
7. Logout
8. Exit

Choice: 3
-----------
Show my tickets:
***** Ticket 3 [RESOLVED] *****
Reported by: Tristan
Reported time: 03-05-2018 08:15:06
Issue: I am stuck at level 15 of Angry Birds

Resolved by: Erik [Troubleshooter] Lecturer, HBO-ICT
Solution: Stop fooling around and get back to work. BTW: touch the screen twice to let the blue birds split.
Solved time: 04-05-2018 11:45:12
Duration: 27.5 hours

***** Ticket 7 [UNRESOLVED] *****
Reported by: Tristan
Reported time: 24-03-2021 10:50:38
Issue: My cat destroyed my mouse.
```

Note that the newly created ticket (7) is not resolved yet, as no "troubleshooter" signed on to do so!

## A regular user trying to access privileged (troubleshooter only) functions
```text
-----------
I-Desk
-----------
1. Add ticket
2. Resolve ticket [Troubleshooter only!]
3. Show my tickets
4. Show open tickets [Troubleshooter only!]
5. Show all tickets [Troubleshooter only!]
6. Show users [Troubleshooter only!]
7. Logout
8. Exit

Choice: 2
-----------
Resolve ticket:
Please enter the ticket number:
7

Please enter the response:
Can I fix this myself?
Current user is not allowed to resolve the ticket

-----------
I-Desk
-----------
1. Add ticket
2. Resolve ticket [Troubleshooter only!]
3. Show my tickets
4. Show open tickets [Troubleshooter only!]
5. Show all tickets [Troubleshooter only!]
6. Show users [Troubleshooter only!]
7. Logout
8. Exit

Choice: 4
-----------
Show open tickets:

-----------
I-Desk
-----------
1. Add ticket
2. Resolve ticket [Troubleshooter only!]
3. Show my tickets
4. Show open tickets [Troubleshooter only!]
5. Show all tickets [Troubleshooter only!]
6. Show users [Troubleshooter only!]
7. Logout
8. Exit

Choice: Current user has not enough privileges to perform this action
5
-----------
Show all tickets:

-----------
I-Desk
-----------
1. Add ticket
2. Resolve ticket [Troubleshooter only!]
3. Show my tickets
4. Show open tickets [Troubleshooter only!]
5. Show all tickets [Troubleshooter only!]
6. Show users [Troubleshooter only!]
7. Logout
8. Exit

Choice: Current user has not enough privileges to perform this action
6
-----------
Show all users:

-----------
I-Desk
-----------
1. Add ticket
2. Resolve ticket [Troubleshooter only!]
3. Show my tickets
4. Show open tickets [Troubleshooter only!]
5. Show all tickets [Troubleshooter only!]
6. Show users [Troubleshooter only!]
7. Logout
8. Exit

Choice: Current user has not enough privileges to perform this action
```
Note: Since the `Helpdesk` class determines whether or not a method requires "troubleshooter access", you might sometimes
see an example where the application FIRST prompts for input and THEN discovers it has no priviliges. You don't have to
worry about this, this is just how we designed the `Helpdesk` class.

## Trying to log in with invalid credentials
```text
-----------
I-Desk
-----------
Please give your username: Tristan
Please give your password: thisIsNotMyPassword
ERROR: Cannot login user. Invalid credentials
```

## Logging in as a "Troubleshooter"
Note that before we can resolve tickets, we need to log in as a troubleshooter and we are currently still logged in 
as "Tristan". We need to log out first!
```text
-----------
I-Desk
-----------
1. Add ticket
2. Resolve ticket [Troubleshooter only!]
3. Show my tickets
4. Show open tickets [Troubleshooter only!]
5. Show all tickets [Troubleshooter only!]
6. Show users [Troubleshooter only!]
7. Logout
8. Exit

Choice: 7
-----------

-----------
I-Desk
-----------
Please give your username: Erik
Please give your password: test

-----------
I-Desk
-----------
1. Add ticket
2. Resolve ticket [Troubleshooter only!]
3. Show my tickets
4. Show open tickets [Troubleshooter only!]
5. Show all tickets [Troubleshooter only!]
6. Show users [Troubleshooter only!]
7. Logout
8. Exit

Choice: 2
-----------
Resolve ticket:
Please enter the ticket number:
7
Please enter the response:
Buy a new mouse!

-----------
I-Desk
-----------
1. Add ticket
2. Resolve ticket [Troubleshooter only!]
3. Show my tickets
4. Show open tickets [Troubleshooter only!]
5. Show all tickets [Troubleshooter only!]
6. Show users [Troubleshooter only!]
7. Logout
8. Exit

Choice: 4
-----------
Show open tickets:
***** Ticket 2 [UNRESOLVED] *****
Reported by: Steven
Reported time: 14-11-2019 14:45:35
Issue: My computer contains MacOS, but I am a Windows user...

***** Ticket 5 [UNRESOLVED] *****
Reported by: Vincent
Reported time: 03-03-2020 08:00:01
Issue: Help, my computer contains a virus. Is it contagious to humans?

***** Ticket 6 [UNRESOLVED] *****
Reported by: Ruud
Reported time: 05-01-2021 17:15:23
Issue: I bought a red inktjetprinter. Why does it only print in grayscale?

```
Note that these tickets can be found in the data file and haven't been resolved in years!

```text
-----------
I-Desk
-----------
1. Add ticket
2. Resolve ticket [Troubleshooter only!]
3. Show my tickets
4. Show open tickets [Troubleshooter only!]
5. Show all tickets [Troubleshooter only!]
6. Show users [Troubleshooter only!]
7. Logout
8. Exit

Choice: 5
-----------
Show all tickets:
***** Ticket 1 [RESOLVED] *****
Reported by: Evert
Reported time: 03-12-2019 10:15:30
Issue: Where is the power button of my computer?

Resolved by: Oliver [Troubleshooter] Lecturer, HBO-IT
Solution: The powerbutton is on the backside of the Macintosh machine.
Solved time: 15-12-2019 10:05:23
Duration: 287.83 hours

***** Ticket 2 [UNRESOLVED] *****
Reported by: Steven
Reported time: 14-11-2019 14:45:35
Issue: My computer contains MacOS, but I am a Windows user...

***** Ticket 3 [RESOLVED] *****
Reported by: Tristan
Reported time: 03-05-2018 08:15:06
Issue: I am stuck at level 15 of Angry Birds

Resolved by: Erik [Troubleshooter] Lecturer, HBO-ICT
Solution: Stop fooling around and get back to work. BTW: touch the screen twice to let the blue birds split.
Solved time: 04-05-2018 11:45:12
Duration: 27.5 hours

***** Ticket 4 [RESOLVED] *****
Reported by: Rogier
Reported time: 09-03-2019 11:15:40
Issue: How can I connect a mouse to my computer?

Resolved by: Peter [Troubleshooter] Researcher, HBO-ICT
Solution: A mouse contains a USB-connector which attached to the USB-port of the system. It is a simple plug and play operation which you can perform yourself.
Solved time: 11-03-2019 09:45:56
Duration: 46.5 hours

***** Ticket 5 [UNRESOLVED] *****
Reported by: Vincent
Reported time: 03-03-2020 08:00:01
Issue: Help, my computer contains a virus. Is it contagious to humans?

***** Ticket 6 [UNRESOLVED] *****
Reported by: Ruud
Reported time: 05-01-2021 17:15:23
Issue: I bought a red inktjetprinter. Why does it only print in grayscale?

***** Ticket 7 [RESOLVED] *****
Reported by: Tristan
Reported time: 24-03-2021 10:50:38
Issue: My cat destroyed my mouse.

Resolved by: Erik [Troubleshooter] Lecturer, HBO-ICT
Solution: Buy a new mouse!
Solved time: 24-03-2021 10:57:58
Duration: 0.12 hours

```
Note ticket 7: We were really fast there!

```text
-----------
I-Desk
-----------
1. Add ticket
2. Resolve ticket [Troubleshooter only!]
3. Show my tickets
4. Show open tickets [Troubleshooter only!]
5. Show all tickets [Troubleshooter only!]
6. Show users [Troubleshooter only!]
7. Logout
8. Exit

Choice: 6
-----------
Show all users:
Evert
Ruud
Tristan
Steven
Rogier
Vincent
Oliver [Troubleshooter] Lecturer, HBO-IT
Erik [Troubleshooter] Lecturer, HBO-ICT
Peter [Troubleshooter] Researcher, HBO-ICT
Remco [Troubleshooter] Lecturer, HBO-ICT

-----------
I-Desk
-----------
1. Add ticket
2. Resolve ticket [Troubleshooter only!]
3. Show my tickets
4. Show open tickets [Troubleshooter only!]
5. Show all tickets [Troubleshooter only!]
6. Show users [Troubleshooter only!]
7. Logout
8. Exit

Choice: 8
```