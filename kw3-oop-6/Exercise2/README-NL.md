# Indiaase dishkwis
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg)
Schrijf een programma waarin je gequizzed wordt op je kennis van de Indiase keuken en de bijbehorende gerechten.

Per ronde zal de computer een willekeurig gerecht kiezen en wordt de gebruiker gevraagd wat voor soort gerecht dit is. De gebruiker beantwoordt deze vraag aan de hand van een lijst van opties die getoond worden waarvan er een gekozen moet worden.

Deze opties zijn echter afhankelijk van de dataset die gebruikt wordt. Je dient dus, voordat je deze opties presenteert eerst te bepalen welke dit zijn door `indian_food.csv` te doorlopen en te kijken naar kolom 6 ("course").

Voor elk goed beantwoordde vraag krijgt de gebruiker een punt en gaat deze door naar de volgende vraag. Zodra de gebruiker een verkeerd antwoord geeft, zal het programma worden afgesloten. Er is geen maximum aan het aantal vragen dat een gebruiker kan krijgen.

Wij hebben het bestand `indian_food.csv` voor je toegevoegd met alle data die je nodig hebt.

**Hints:**
- Bouw eerst de datastructuur om de gerechten in op te kunnen slaan.
- Maak een statische methode in je datastructuur om een CSV regel om te kunnen zetten in een object.

## Voorbeeld
```text
********** Question 1: **********
Dish name: Navrattan korma
Ingredients: Green beans, potatoes, khus khus, low fat, garam masala powder

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
```