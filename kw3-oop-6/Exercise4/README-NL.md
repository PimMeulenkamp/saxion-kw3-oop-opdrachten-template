# Verzekeringen afsluiten
## Moeilijkheid: ![Filled](../resources/star-filled.svg)  ![Filled](../resources/star-filled.svg)  ![Filled](../resources/star-filled.svg) 
In deze opdracht gaan we premies voor verzekeringen berekenen op basis van de gegevens de van zaken die we willen verzekeren
(een reis, een huis of een auto) in combinatie met de verzekeraar. De exacte details van de verzerkingen hebben wij voor
deze opdracht zelf verzonnen en zijn op geen enkele manier gekoppeld aan bestaande producten. Het kan dus zijn dat sommige
waarden apart zijn.

In de `Application` klasse hebben wij de code van het gebruik van de verschillende klassen opgenomen (met commentaar) zodat
de opdracht duidelijker wordt. De onderstande voorbeelduitvoer is het resultaat dat je mag verwachten op basis van de input
zoals deze in de klasse gegeven is.

Het programma werkt met `Client`s die meerdere dingen kunnen verzekeren. In deze applicatie kunnen slechts 3 zaken verzekerd
worden: Huizen, auto's en reizen. Auto's en huizen zijn ook zogenaamde `InsurableObjects`, fysieke dingen die je kan 
verzekeren op basis van de marktwaarde. Een reis kan verzekerd worden op basis van locatie (en erft dus niet van deze 
klasse).

Schrijf nu zelf een uitbreiding op dit programma voor de verzekeringen. Hanteer daarbij het volgende ontwerp:
- Elke `Insurance` heeft een unieke identifier (nummer) binnen de applicatie. De eerste verzekering krijgt nummer "1000",
alle verzekeringen die vervolgens worden aangemaakt krijgen elk een oplopend nummer.
- Elke `Insurance` kent ook een `Client` aan wie de verzekering is gekoppeld. Deze client is niet meer veranderbaar nadat
deze ingesteld is.
- Van elke verzekering kan je ook de kosten opvragen door middel van de `getCost()` methode.  Hoe deze kosten worden berekend
leggen we hier onder uit.
  
Van een `TravelInsurance` (reisverzekering) moet naast de client, ook de bestemming, datum van vertrek en het aantal dagen
van de reis worden opgeslagen. De bestemming en het aantal dagen bepaald de _basisprijs_ van een verzekering. Gebruik
hiervoor de onderstaande tabel. We raden jullie aan hiervoor een `static` methode te ontwikkelen, die de bestemming
en aantal dagen kan omzetten naar de _basisprijs_ van de verzekering.

| Bestemming        | Berekening           | 
| ------------- |:-------------:|
| America     | 20 euro standaard + 5 euro per dag van de reis |
| Africa     | 50 euro standaard + 7 euro per dag van de reis |
| Europe     | 5 euro standaard + 2 euro per dag van de reis |
| Asia     | 30 euro standaard + 5 euro per dag van de reis |

Het is mogelijk dat je als verzekeringnemer korting krijgt op deze verzekering. Het bedrijf geeft namelijk _alle personen
onder de 30, 20% korting op hun reisvezekeringen_. Bestudeer het voorbeeld, de reis van de jonge Tristan kost 180 euro
voor 30 dagen Azie, maar krijgt 36 korting, waardoor zijn kosten dus slechts 180-36 = 144 euro zijn. De oude Tristan 
krijgt deze korting niet voor de trip naar Afrika.

Een `CarInsurace` is iets eenvoudiger. De basisprijs van een autoverzekering is 2% van de marktwaarde van de auto. Echter,
de korting die vervolgens berekend wordt voor de chauffeur gaat op basis van het aantal jaren dat deze schadevrij gereden
heeft. Bij 25 schadevrije jaren is de maximale korting van 90% bereikt. Een beginnend chauffeur (met 0 schadevrije jaren)
zal daarom op (90-25) 65% korting beginnen en krijgt elk jaar als deze schadevrij rijdt 1% extra korting op zijn verzekering
(tot een maximum van 90%). Technische wordt dit geimplementeerd door elk jaar een nieuwe verzekering af te sluiten met
de client totdat de maximale korting is bereikt.

Een `HomeInsurance` (woonhuisverzerkering) kent alleen de woning als benodigde informatie. De basisprijs van een 
woonhuisverzekering is 1% van de waarde van de woning. Daarbij kent het bedrijf de volgende actie: _Alle verzekeraars
die ouder zijn dan 60 jaar, krijgen 90% op hun woonhuisverzekering!_. Of dit eerlijk is of niet laten we voor nu
buiten beschouwing, maar merk dus op dat de oude Tristan erg weinig betaald voor zijn woonhuisverzekering!

Een paar tips:
- Begin met de woonhuisverzekering. Deze is het kleinst.
- Merk op de static methoden ook gebruikt worden voor het printen van de basisprijzen. Dit is vooral gedaan om jullie
"te forceren" bepaalde methoden echt static te maken. Dit kan uiteraard ook anders!

# Voorbeeld
```text
The base insurance price for van Galenstraat 19, Enschede is 1250
The base price for a car insurance for 123-456-AB (Ford) is: EUR 500
The base price for a travel insurance to Asia costs for 30 days: EUR 180

Overview for Tristan Pothoven, born 2000-01-01: 
	Insurance id: 1001, Car insurance for 123-456-AB (Ford): EUR 335
	Insurance id: 1002, Home insurance for van Galenstraat 19, Enschede (125000): EUR 1250
	Insurance id: 1003, Travel insurance for the trip to Asia for 30 on 2021-08-01: EUR 144

The total cost of all insurances are EUR 1729

******** A FEW YEARS LATER *************
The base insurance price for Handelskade 75, Deventer is 4500
The base price for a car insurance for AB-1234-XY (Flying Tesla) is: EUR 1500
The base price for a travel insurance to Africa costs for 15 days: EUR 155

Overview for Tristan Pothoven, born 1960-01-01: 
	Insurance id: 1004, Home insurance for Handelskade 75, Deventer (450000): EUR 450
	Insurance id: 1005, Car insurance for AB-1234-XY (Flying Tesla): EUR 1350
	Insurance id: 1006, Travel insurance for the trip to Africa for 15 on 2035-01-01: EUR 155

The total cost of all insurances are EUR 1955
```