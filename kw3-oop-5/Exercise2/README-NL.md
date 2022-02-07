# Dierentuin
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-outlined.svg) ![Outlined](../resources/star-outlined.svg) 

We maken een dierentuin met een aantal kooien. In een kooi <u>mag maar één type dier</u> worden opgeslagen, wel logisch want we willen bijvoorbeeld niet dat de leeuw andere dieren op gaat eten.
Zodra er dus een dier wordt toegevoegd aan de kooi kunnen er enkel nog maar dieren van hetzelfde type worden toegevoegd.
Elke kooi heeft een maximale capaciteit die standaard 3 is.

Er zijn vier soorten dieren in onze dierentuin. Van elk dier moeten we opslaan: het geslacht en de naam.
Daarnaast moeten we nog een aantal specifieke attributen bijhouden van verschillende dieren:
- Leeuwen: of het een Afrikaanse leeuw is, zo niet dan is het een Perzische leeuw.
- Olifanten: het gewicht in kg.
- Giraffe: de lengte in cm.
- Apen: de soort als String.

We willen `toString()` methoden in iedere klasse, zodat we eenvoudig de eigenschappen van de verschillende dieren en de inhoud van de kooien kunnen printen.
Zorg daarnaast voor goede foutafhandeling. Bekijk (en test) de bijbehorende unit tests.

### Hints:
- Mocht het lastig zijn om er voor te zorgen dat er maar één type dier in een kooi kan, sla dit dan eerst over.
- Je kunt van een object bepalen welke klasse het is door de methode `getClass()` aan te roepen. `Class` objecten zijn te vergelijken met de `equals()` methode.

## Extra: tekenen (![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg))
We gaan nu de `Cage` klasse uitbreiden met een `void draw(int x, int y)` methode, waarmee we de kooi tekenen op een bepaalde locatie.
Daarnaast maken we een `void draw(int x, int y)`. Voor ieder type dier is een plaatje meegeleverd die je kunt gebruiken bij het tekenen (zie de map `images`).

![Example](sample_output.png)

## Relevant links
* [Java documentation SaxionApp](https://saxionapp.hboictlab.nl/nl/saxion/app/SaxionApp.html)
* [Images by Terdpong Pangwong](https://www.vecteezy.com/free-vector/nature)