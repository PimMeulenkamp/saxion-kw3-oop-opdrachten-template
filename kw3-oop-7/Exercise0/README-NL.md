# CD collectie
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) ![Outlined](../resources/star-outlined.svg)

Bij deze opdracht ga je een CD-verzameling modelleren. De bedoeling is dat je aan deze collectie CD's kan toevoegen,
verwijderen en enkele statistieken kan bepalen. Hierbij kunnen verschillende dingen fout gaan en daarvoor gaan we onze eigen `Exception`
gebruiken.

Een CD-verzameling bestaat uit CD's. Iedere CD heeft een artiest en een titel. Op elke CD staan tracks. Iedere track
heeft een titel en een lengte (tijd). Van iedere CD moet de totale lengte op te vragen zijn en alle attributen die
opgeslagen zijn van de CD. Daarnaast moet de `toString()` een nette genummerde tracklisting opleveren.

Om eenvoudig te kunnen werken met al die verschillende CD's dien je een `CDCollectie`-klasse te schrijven die bijhoudt
welke CD's we in ons bezit hebben. De volgende methodes moeten aanwezig zijn in deze collectie klasse:

- `void addCD(CD cd)`: deze methode voegt een CD toe aan de collectie, behalve als dit album (zelfde artiest en titel)
  al aanwezig is, dan wordt er een `CDCollectionException` gegooid met een duidelijke foutmelding.
- `void removeCD(CD cd)`: deze methode verwijdert een CD uit de collectie en gooit een `CDCollectionException` als het
  album niet in de collectie aanwezig is.
- `ArrayList<String> getArtists()`: geeft een lijst met alle artiesten in de collectie. Dubbelingen worden verwijderd
  uit de lijst.
- `ArrayList<CD> getAllCDs()`: geeft een lijst van alle CD's terug.
- `ArrayList<CD> findCDsByArtist(String artist)`: geeft een lijst met alle CD's terug van een artiest.
- `CD findCD(String artist, String title)`: geeft een speciefieke CD terug van een artiest en met een bepaalde titel.

Bouw bovenstaande datamodel en implementeer de Application klasse.

## Voorbeeld
Albums moeten op de volgende manier geprint worden:

```text
Album: Coldplay - A rush of blood to the head
Total time: 0:54:08
Tracks:
1. Politik (05:18)
2. In my place (03:48)
3. God put a smile upon my face (04:57)
4. The scientist (05:09)
5. Clocks (05:07)
6. Daylight (05:27)
7. Green eyes (03:43)
8. Warning sign (05:31)
9. A whisper (03:58)
10. A rush of blood to the head (05:51)
11. Amsterdam (05:19)
```

## Hints
* Als je moeite hebt met rekenen met tijd, houd dan alles bij in seconden en toon eerst alle lengtes in seconden. Je kunt
ook gebruik maken van de `Duration` klasse.
