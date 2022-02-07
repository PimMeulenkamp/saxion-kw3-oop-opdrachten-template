# Yahtzee
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg)  

We gaan een applicatie bouwen waarmee we 5 dobbelstenen kunnen werpen. De dobbelstenen gaan we visualiseren door ze te tekenen op het canvas.
In het laatse deel van de opdracht ga je bepalen welke combinatie er geworpen is. Kijk voor de combinaties van Yatzee [hier.](https://nl.wikipedia.org/wiki/Yahtzee)

#### Implementatie
We hebben twee klassen nodig voor deze opdracht: een klasse Yathzee en een klasse Dice.
Maak een klasse Dice met een `roll()` methode die een willekeurig getal van 1-6 teruggeeft.
Maak vervolgens een Yathzee klasse waarin 5 dobbelstenen worden aangemaakt.
Implementeer de methode `roll()` die een integer array teruggeeft met daarin de uitkomsten van de 5 worpen. 

#### Visualisatie
Maak een `draw()` methode in de Yathzee klasse waarmee alle dobbelstenen getekend kunnen worden.
Hint: maak een `draw(int x, int y, int width)` methode in de klasse Dice die één dobbelsteen kan tekenen op een bepaalde locatie.  

#### Combinatie bepalen (![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg))
Implementeer de methode `determineCombination(int[] diceOutcomes)` die een String teruggeeft die aangeeft wat de hoogste mogelijke combinatie is.

Let op: Dit is wel een pittige oefening! Begin daarom simpel en werk dit steeds verder uit.

#### Testen
Probeer ook eens een paar testen te schrijven voor je eigen klassen. Wij hebben al een opzetje van een paar testen gegeven, maar deze zijn natuurlijk nog lang niet af. Denk hier goed over na!

## Relevante links
* [Java documentatie van de SaxionApp](https://saxionapp.hboictlab.nl/nl/saxion/app/SaxionApp.html)