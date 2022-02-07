# Parkeergarage
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg)

We gaan het administratiesysteem van een parkeergarage modelleren in de volgende opdracht. Een parkeergarage heeft twee
soorten plekken: plekken voor auto's en plekken voor motoren.

Het aantal plekken voor auto's en het aantal plekken voor motoren is eenmalig instelbaar bij het aanmaken van de
parkeergarage.

Een auto en een motor hebben beiden een kenteken, een start datum/tijd (het moment dat ze de parkeergarage inrijden) en
een eind datum/tijd (het moment dat ze wegrijden en hebben betaald). Zodra een auto of een motor wegrijdt komt er 
uiteraard weer een plek vrij, maar we slaan het object nog wel op in ons archief, zodat we achteraf kunnen bepalen wat 
er verdiend is met de parkeergarage.

De tarieven voor auto en motor zijn verschillend:
- Parkeren met een auto kost €2.00 per uur en na 24 uur is het €5.00 per dag.
- Parkeren met de motor kost €0.50 per uur, ongeacht hoe lang je staat.

Je hoeft enkel geld te rekenen voor hele uren. (0-59 minuten parkeren is dus gratis, 60-119 minuten is dus 1 uur, etc.) 
Het maakt verder niet uit of je overdag of 's nachts parkeert, de kosten worden altijd op dezelfde manier berekend.

Als een auto of motor de parkeergarage in wil rijden, maar de garage is vol dan wordt er een zelf te maken 
`ParkingGarageException` gegooid.

Zorg ervoor dat de parkeergarage methoden heeft om:
- een auto/motor te laten parkeren.
- een auto/motor te laten uitrijden.
- te bepalen hoeveel auto's er momenteel geparkeerd zijn.
- te bepalen hoeveel motoren er momenteel geparkeerd zijn.
- te bepalen wat er in totaal verdiend is bij de parkeergarage.

Om je op weg te helpen hebben wij weer een `Application` klasse gegeven met voorbeeldcode en hebben we wat lege klassen
gegeven die je uiteraard nog moet aanpassen / aanvullen!

Bovendien geven we jullie de `Simluation` klasse die wat hulpmethoden bevat om eenvoudig wat voorbeeld-voertuigen aan te
kunnen maken. Ga vooral in de officiële Java documentatie opzoek naar de beschrijvingen van de methoden die we hier
gebruiken als je twijfelt over wat bepaalde code doet! (We verwachten uiteraard niet dat jullie dit soort code nu al
zelf zouden kunnen verzinnen. Zie het dus vooral als een voorbeeld!)

