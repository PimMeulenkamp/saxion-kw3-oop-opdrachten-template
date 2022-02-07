# Validatie
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) ![Outlined](../resources/star-outlined.svg) 

Bij deze opdracht ga je oefenen met het gooien en vangen van (Runtime)Exceptions.
We gaan een `Person` klasse implementeren waarbij verschillende controles uitgevoerd moeten worden zodra er setter aangeroepen wordt.
Indien de waardes die meegegeven worden niet voldoen aan de eisen, zal er een `IllegalArgumentException` gegooid moeten worden.

In de Application klasse gaan we de code testen en eventueel gegooide fouten afvangen! Er is al één voorbeeld gegeven van hoe je fouten kunt afhandelen.

#### Validatie
De volgende methoden zijn beschikbaar in de persoon klasse. Per methode wordt aangegeven hoe de parameters moeten worden gevalideerd:

|Methode|Uitleg|
|---|---|
|`setAge`|De leeftijd van de persoon kan nooit onder 0 zijn, ook niet groter dan 150.|
|`setZipcode`|We gaan Nederlandse postcodes valideren: eerst 4 cijfers, dan 2 letters. We gaan er vanuit dat er geen spatie zit tussen cijfers en letters|
|`setPhonenumber`|We gaan Nederlandse telefoonnummers valideren: ieder telefoonnummer begint met een 0, gevolgd door 9 cijfers.|

#### Hints
Je kunt de methodes: `Character.isLetter()` en `Character.isDigit()` uit de java bibliotheek gebruiken om te controleren of een `char` een letter of cijfer is.

#### Tests
Bestudeer de gegeven tests voor het testen van de leeftijd. Bouw nu je eigen testmethoden om de andere validatiemethoden te testen.

## Relevante links
* [Java documentatie van de SaxionApp](https://saxionapp.hboictlab.nl/nl/saxion/app/SaxionApp.html)
* [Java documentatie Character klasse](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Character.html)

