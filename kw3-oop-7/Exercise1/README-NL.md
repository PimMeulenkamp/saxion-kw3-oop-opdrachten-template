# Lezen van het bestandssysteem
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) ![Outlined](../resources/star-outlined.svg)

Als IT-er heb je regelmatig te maken met het bestandssysteem, ongeacht of je nou na deze module verder gaat met Software
Engineering of IT Service Management. Bij deze opdracht gaan we een script schrijven die een map en alle submappen op je
besturingssysteem in kaart brengt.

Hiervoor gaan we gebruik maken van de `java.io.File` klasse die te vinden is in de standaard bibliotheek van Java. Omdat
je steeds vaker klassen moet gaan gebruiken die je nu _nog niet kent_ gaan we niet te veel over deze klasse uitleggen,
maar moet je zelf de officiele documentatie van deze klasse gaan lezen.

Bestudeer daarom de volgende pagina
aandachtig: [Java File documentation](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/File.html)

**Let op:** Met deze opdracht gaan we het bestandssysteem gebruiken en *dus* moet je even voorzichtig zijn met de paden
die je hier aangeeft. Alhoewel wij alleen maar gaan uitlezen wat er op je bestandssysteem staat moet je je voorstellen
dat je ook bestanden kan verwijderen.

## Alle bestandsnamen in mappen verzamelen
We hebben een voorbeeldmapje meegeleverd met wat bestanden en een paar submappen zodat je een "veilige" omgeving hebt
om mee te experimenteren. In dit project vind je daarom de volgende directory en subdirectories.

- samplefolder
    - subfolder1
        - style.css
        - website.html
    - subfolder2
        - LostFile.java
    - description.txt
    - elephant.png
    - giraffe.png
    - README.md

Nu gaan we in de `Application` klasse de methode `listAllFiles(String directory)` implementeren. We gaan ons richten op
de bestanden in de hoofdmap en de namen van de submappen (NIET de inhoud van de submappen, zie bonus).

De bedoeling is dat je de hoofdmap opent en een overzicht geeft van de namen van alle submappen en de bestanden in de
hoofdmap. We tonen hierbij eerst alle submappen en vervolgens alle bestanden. Van de bestanden kan je ook eenvoudig
laten zien wat de bestandsgrootte is in `bytes`. Je moet hiervoor nog wel even uitzoeken met welke methode je precies de
lengte van het bestand kan opvragen.

Je resultaat ziet er als volgt uit:

```
Directories:
- subfolder1
- subfolder2

Files:
- description.txt (63 bytes)
- document.csv (120 bytes)
- elephant.png (14426 bytes)
- giraffe.png (11633 bytes)
- README.md (344 bytes)
```

Zorg voor goede foutafhandeling in je programma als de folder die je wil bekijken niet bestaat.

## Bonus: Subdirectories ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg)

Breid je huidige programma uit zodat ook van de subdirectories de inhoud wordt getoond. Merk op dat je hier dezelfde
methode voor kan gebruiken die je hier aan maken bent. Het hergebruiken van dezelfde methode (op een kleiner onderdeel
van het geheel) wordt in het programmeren ook wel het _toepassen_ van recursie genoemd.

Zorg er voor dat van een directory ook getoond kan worden hoe "groot" deze in totaal is. Dit moet je doen door de som
van alle bestandsgrootten te nemen. (Directories zelf hebben geen bestandsgrootte!)