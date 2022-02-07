# Programmeerstijlen
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) 
Iedere programmeertaal heeft eigen conventies voor het schrijven van nette code. Onder _conventies_ verstaan wij bepaalde
manieren waarop je dingen hoort op te schrijven zodat deze goed leesbaar zijn voor andere programmeurs.

Zo zijn er bij het programmeren Java de volgende afspraken:
- Variabelen schrijven we altijd in _camel case_
- Klasse namen zijn altijd in _Pascal case_.
- Klasse constanten (`public static final`-velden) altijd in upper snake case (ENKEL_HOOFDLETTERS met een _ tussen de woorden).

Bij deze opdracht gaan we zelf een `StringUtils` klasse maken die hulpmethoden bevat om Strings om te zetten naar de 
verschillende case styles die gebruikt worden bij programmeren. Deze case styles moet je implementeren, van iedere 
style hebben we een voorbeeld toegevoegd:
- Camel case (ditIsEenVoornaam, je begint met een kleine letter en dan wordt elk zelfstandig naamwoord weer met een hoofdletter
  geschreven).
- Pascal case (DitIsEenVoornaam, vergelijkbaar met camel case, maar nu is de eerste letter ook met een hoofdletter).
- Snake case (dit_is_een_voornaam, lowercase letters met _ (underscore) waar spaties staan).
- Upper snake case (DIT_IS_EEN_VOORNAAM).
- Kebab case (dit-is-een-voornaam, lowercase letters met - (streepje) waar spaties staan).
- L33t (d1t 1s 33n v00rn44m).

Bij de relevante links vind je meer informatie over de verschillende case stijlen.

L33t is uiteraard geen case style die gebruikt wordt bij programmeertalen, maar wel een internetschrijfwijze die wordt 
gebruikt door mensen die iets te veel met IT bezig zijn. Bij L33t sp34k kun je volstaan door enkel substituties te 
schrijven voor alle klinkers.

## Relevante links
* [Case styles in other programming languages](https://betterprogramming.pub/string-case-styles-camel-pascal-snake-and-kebab-case-981407998841)
* [L33t sp34k](https://nl.wikipedia.org/wiki/Leet)
