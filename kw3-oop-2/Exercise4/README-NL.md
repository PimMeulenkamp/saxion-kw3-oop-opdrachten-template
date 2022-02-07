# Een vliegtuig met passagiers
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) 

Maak een programma waarmee je mensen kan laten instappen in een vliegtuig. Wij hebben hier al enkele dingen voor jullie klaar gezet zodat je niet alles vanaf niets hoeft op te bouwen. Het is de bedoeling dat je de klasse `Airplane` gaat bouwen.

De volgende spelregels zijn van toepassing voor dit programma:
* Een vliegtuig heeft een maximum aantal personen dat meegenomen kan worden en een maximum gewicht aan bagage dat vervoerd kan worden.
    * Het aantal personen moet ingevoerd worden bij het aanmaken van een `Airplane`, maar mag niet meer aangepast worden na het aanmaken van een Airplane instantie.
    * Elke persoon neemt een bepaalde hoeveelheid bagage mee dat ook mee moet in het vliegtuig. Elke persoon neemt 0-3 tassen mee waarin dit gewicht verdeeld zit. Het is daarbij van belang dat het vliegtuig niet over het maximale gewicht (wat het kan vervoeren) heen komt. Dit maximum is 25 kg * het aantal personen dat in het vliegtuig past. (Dus bij 40 personen in het vliegtuig, mag maximaal 1000 kg aan bagage mee.)

Schrijf nu de volledige implementatie van het programma, waarbij je je richt op het toevoegen van de volgende functionaliteit:
* Je moet van een vliegtuig de deuren kunnen sluiten (`lockDoors()`) en kunnen openen (`unlockDoors()`). Ook moet je kunnen opvragen of de deuren op slot zitten of niet (`hasLockedDoors()`)
* Schrijf vervolgens een methode `boardPassenger(Passenger p)` waarmee je een bepaalde passagier in het vliegtuig kan laten plaatsnemen.
  * Let er op dat er dat er een aantal fouten kunnen optreden waarvoor of een `IllegalArgumentException` of een `IllegalStateException` gegooid dient te worden.    
    * Een IllegalStateException gooi je als de deuren van het vliegtuig dicht zitten als je iemand wil laten boarden.
    * Een IllegalArgumentException gooi je er geen ruimte meer is voor de passagier of dat de bagage van de passagier er voor zorgt dat het maximale gewicht wat het vliegtuig kan dragen overschreven wordt.  
* Schrijf de methode `depart()` waarmee je het vliegtuig kan laten vertrekken.
    * Ook hier verwachten we een IllegalStateException als je probeert te vertrekken zonder dat de deuren op slot zitten.

Om alle situaties verder goed te kunnen controleren hebben wij twee officiele testklassen meegeleverd om je model te testen. In de les bespreken we het principe van testen beter, maar bij deze kan je alvast zien en experimenteren met de code. Bestudeer deze dus gerust! De testen kunnen geworden in de `test` map (onder `src`).

## Relevante links
* [Java documentatie van de SaxionApp](https://saxionapp.hboictlab.nl/nl/saxion/app/SaxionApp.html)

