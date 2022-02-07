# Gebouwen
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) ![Outlined](../resources/star-outlined.svg) 

Bij deze opdracht ga je oefenen met overerving. We gaan een overervingsstructuur bouwen waar we gemeenschappelijke attributen opslaan in een super klasse en de specifieke attributen opslaan in de klassen zelf.

In de applicatie die we gaan bouwen zijn er twee soorten gebouwen: huizen en kantoren. Van elk gebouw moeten we opslaan: het adres, de postcode en de oppervlakte in vierkante meters. Deze attributen kunnen niet meer gewijzigd worden zodra ze ingesteld zijn. Wel moet het mogelijk zijn om de gegevens op te vragen bij het object.

Een huis is een gebouw met een aantal extra attributen. Bij een huis slaan we op: de naam van de eigenaar, of het huis een garage heeft (of niet) en de prijs van het huis in euro's. Bij een huis kan de eigenaar wijzigen. De andere attributen blijven hetzelfde en kunnen, nadat ze ingesteld zijn, niet meer wijzingen. Vanzelfsprekend moeten we wel de gegevens kunnen lezen.

Tot slot is er een kantoor. Dit is een gebouw, aangevuld met de volgende eigenschappen: de naam van het bedrijf dat er gehuisvest is en het aantal medewerkers dat er werkt. De bedrijfsnaam en het aantal medewerkers moet aanpasbaar zijn.

Implementeer de verschillende klassen. Maak een `toString()` methode in elke klasse, zodat we eenvoudig de gebouwen kunnen printen. Maak (waar nodig) constructoren, getters en setters.

## Hints:
- Begin met de superklasse en zorg dat alle benodigde eigenschappen, getters, setters en constructors aanwezig zijn.
- Bouw één voor één de subklassen.

## Relevant links
* [Java documentation SaxionApp](https://saxionapp.hboictlab.nl/nl/saxion/app/SaxionApp.html)
