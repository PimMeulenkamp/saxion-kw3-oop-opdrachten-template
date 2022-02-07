# Exporteren naar CSV
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) ![Outlined](../resources/star-outlined.svg) 

Elke klasse heeft standaard een `toString()` methode die we kunnen gebruiken om een mooi leesbare representatie te maken van onze klasse.
Bij deze opdracht willen we ook een mogelijkheid hebben om een klasse te kunnen exporteren naar het CSV formaat. 

We beginnen met een voorbeeld zodat je kunt zien hoe je eigen `CSVExportable` zou moeten werken. Het doel van de opdracht is om een interface te bouwen met de volgende methoden:
- `String toCSV()` deze methode geeft de waarden van het object terug, gescheiden met een `;`.
- `String getCSVHeader()` deze methode geeft de namen van de waarden terug.

### Voorbeeld
In dit voorbeeld gebruiken we onderstaande klasse:
```java
public class Car {
    private String licensePlate;
    private int price;
    
    // Rest of the implementation here...
    ...
}
```

Stel dat de `Car` onze interface implementeert en dat we vervolgens de volgende uitvoeren:
```java
Car c = new Car('XX-12-YY', 10000);
String header = c.getCSVHeader();
String csvData = c.toCSV();
``` 
De variabele `header` zou nu moeten bevatten: `"licensePlate;price"` en de variabele `csvData` zou nu moeten bevatten: `"XX-12-YY;10000"`.

## De opdracht

Je gaat nu zelf een interface bouwen `CSVExportable`, die twee methodes bevat:
- `String toCSV()` deze methode geeft de waarden van het object terug, gescheiden met een `'`.
- `String getCSVHeader()` deze methode geeft de namen van de waarden terug.

Nu gaan we deze interface gebruiken en toevoegen aan een klasse. Een supermarkt heeft vele verschillende producten. 
Ieder product heeft:
- een naam
- een streepjescode (nummer)
- een prijs
- een voorraad (het aantal artikelen dat aanwezig is in de supermarkt)

Schrijf de `CSVExportable` interface zoals bovenaan beschreven. Maak vervolgens de Product klasse en implementeer de methoden van de interface in je klasse.
Bouw een lijst met producten op in een lijst in je `Application` en converteer de hele lijst naar een CSV. Print deze CSV met de SaxionApp.

### Wegschrijven naar een bestand (![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg))
Wegschrijven naar een bestand is niet heel lastig, maar we moeten hier Exceptions afvangen die we nog niet kennen (wordt volgende week uitgelegd).
Kijk eens naar het voorbeeld op deze website: [W3Schools: Java Create and Write To Files](https://www.w3schools.com/java/java_files_create.asp).
Exporteer de lijst met producten naar het bestand `products.csv` en test of je bestand vervolgens weer in te lezen is met de `CSVReader`.

## Relevant links
* [Java documentation SaxionApp](https://saxionapp.hboictlab.nl/nl/saxion/app/SaxionApp.html)
