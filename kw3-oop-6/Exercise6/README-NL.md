# Tweede Kamerverkiezingen 2021
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) 

Bij deze opdracht ga je je eigen stemcomputer bouwen voor de Tweede Kamerverkiezing van 2021.

### Data
Bij de tweede kamerverkiezingen doen er verschillende partijen mee. Van iedere partij moeten we opslaan het lijstnummer en de naam van de partij.
Daarnaast heeft iedere partij één of meerdere kandidaten. Van iedere kandidaat slaan we de positie op de lijst op, de voornaam, het tussenvoegsel, de achternaam en de woonplaats.

De gegevens van alle kandidaten die deelnemen aan de verkiezingen in regio Zwolle zijn opgenomen in `candidates.csv`. Lees dit bestand in.

### De stemcomputer
De stemcomputer werkt als volgt. De gebruiker voert zijn BSN (persoonsnummer) in (in ons geval volstaat een `int`).
Vervolgens toont de stemcomputer een overzicht van alle partijen die meedoen. De gebruiker kiest een partij en de kandidaten van die partij worden getoond.
Vervolgens kiest de gebruiker de kandidaat waar hij/zij op wil stemmen.

Een gebruiker kan één keer een stem uitbrengen. Controleer dus goed of een gebruiker al gestemd heeft!

### De uitslag
Door in het menu van de stemcomputer aan te geven dat de uitslag berekend moet worden, zal het systeem het aantal zetels bepalen.
In totaal zijn er 150 zetels te verdelen in de Tweede Kamer. Toon per partij het aantal zetels dat ze krijgen toegewezen (rond af, hierdoor kan het zijn dat je niet precies op 150 zetels uitkomt!).

## Relevant links
* [Java documentation SaxionApp](https://saxionapp.hboictlab.nl/nl/saxion/app/SaxionApp.html)
