# Hoger, lager
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) ![Outlined](../resources/star-outlined.svg) 

We gaan het spel _Hoger, lager_ (nog eens) bouwen door enkel gebruik te maken van klassen die in de Java bibliotheek 
zitten. Het is dus niet toegestaan bij deze opdracht om de SaxionApp te gebruiken.

Bij het spel hoger, lager selecteert de computer een willekeurig getal tussen 0 en 100. De gebruiker moet vervolgens 
raden wat het getal is. De computer geeft na iedere poging feedback. Er zijn drie mogelijk antwoorden die 
computer kan geven:
- Hoger: je ingevoerde getal is te laag.
- Lager: je ingevoerde getal is te hoog.
- Geraden: je ingevoerde getal is het getal dat we zochten!

De computer houdt bij hoeveel beurten je nodig had om het goede antwoord te raden. Aan het eind zal het systeem vragen 
of je nog een keer wilt spelen. Zo ja, dan wordt het spel herhaald, zo nee, dan wordt het programma afgesloten.

## Voorbeeld
Onderstaande uitvoer van de command line toont hoe het programma eruit hoort te zien:

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
```
