# Bingomolen
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg)

Bij deze opdracht gaan we een bingomolen bouwen. Volgende week bouw je de rest van het spel. Lees eerst de opdracht nauwkeurig door voordat je begint met programmeren!

Een bingomolen is een simpel rad waar aangedraaid wordt om het volgende getal te bepalen voor het spel bingo. De ballen in de molen lopen van 1 t/m 75.
Bij het spelen van het spel kan ieder getal maar één keer getrokken worden! Er zal ook een `reset()` functie moeten worden gebouwd zodat het spel opnieuw gespeeld kan worden.

####Eisen:
- Zorg ervoor dat je een constructor hebt waarmee de bingomolen aangemaakt kan worden en alle ballen (getallen 1 t/m 75 in een lijst) worden toegevoegd.
- Zodra de getallen aangemaakt zijn moet de lijst worden geshuffled (zie **shuffle**).
- Een `getNumberOfBallsRemaining()` methode die aangeeft hoeveel ballen er nog in het apparaat zitten.
- Een `draw()` methode die de eerst volgende bal teruggeeft. Wanneer iemand de `draw()` methode aanroept en er zijn geen ballen meer aanwezig in het apparaat, dan geeft deze methode de waarde -1 terug.
- Een `reset()` methode die het apparaat reset.

####Shuffle:
Om er voor te zorgen dat we constant een nieuwe willekeurige bal uit de bingomolen halen gaan we een shuffle algoritme <u>zelf</u> bouwen.
Zodra de bingomolen wordt aangemaakt, of wanneer iemand de `reset()` methode aanroept zullen de getallen 1 t/m 75 in de lijst moeten worden gezet.
Vervolgens kunnen we de lijst shuffelen met het volgende algoritme:
- Genereer 2 willekeurige random indexen en wissel de elementen die op deze twee plekken staan.
- Herhaal dit een paar honderd keer.

Door eerst de lijst in te vullen met alle unieke waarden (1-75) en vervolgens te shuffelen, weten we zeker dat alle nummers voorkomen en er geen dubbelen zijn. Je moet nu nog wel zelf verzinnen hoe je de getallen 1-voor-1 teruggeeft!

## Voorbeeld
![Preview](sample_output.png)

## Relevante links
* [Uitleg over het spel Bingo](https://nl.wikipedia.org/wiki/Bingo_(spel))
* [Java documentatie van de SaxionApp](https://saxionapp.hboictlab.nl/nl/saxion/app/SaxionApp.html)
* [Overzicht van Shuffle algoritmes](https://en.wikipedia.org/wiki/Fisher%E2%80%93Yates_shuffle)

