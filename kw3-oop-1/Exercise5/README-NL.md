# Vliegtuig
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) 

Schrijf een klasse `Airplane` dat een vliegtuig representeert. We gaan deze klasse gebruiken om een programma te schrijven, waarmee je kan controleren of een vliegtuig _klaar is om te vertrekken_. Een vliegtuig is klaar om te vertrekken als aan 3 voorwaarden is voldaan:
1. Alle passagiers zijn ingestapt (gerepresenteerd door de methode `loadPassengers()`).
2. Alle bagage is ingeladen (gerepresenteerd door de methode `loadLuggage()`).
3. De deuren van het vliegtuig zijn vergrendeld (gepresenteerd door de methode `lockDoors()` en `unlockDoors()`).

Vooral deze laatste voorwaarde (van de deuren) is problematisch en kan botsen met de eerdere voorwaarden. Als de deuren immers dicht zitten kunnen er ook geen passagiers en bagage worden ingeladen. De deuren moeten dus echt _unlocked_ zijn voordat het laden kan beginnen. 

Je dient bovenstaande methoden zelf te implementeren. Je hoeft niet per se individuele passagiers te modelleren, een boolean value waarmee je aangeeft dat _iedereen aan boord is_ en _dat alle bagage aan boord is_, is voldoende.

Implementeer tenslotte de methode `depart()` waarmee je het vliegtuig kan laten vertrekken. Deze methode dient de hierboven genoemde voorwaarden te controleren. Als er iets niet klopt (bijv. de deuren zitten niet dicht), dient hier een correcte foutmelding voor gegeven te worden.

Om je programma eenvoudig te kunnen testen hebben wij je alvast een menu gegeven dat je kan gebruiken, inclusief 3 scenario's die je zelf kan doorlopen. Denk ook vooral zelf na over eventuele variaties van deze scenario's en test deze ook! Testen is immers een belangrijk onderdeel van het programmeren.

## Relevante links
* [Java documentatie van de SaxionApp](https://saxionapp.hboictlab.nl/nl/saxion/app/SaxionApp.html)

