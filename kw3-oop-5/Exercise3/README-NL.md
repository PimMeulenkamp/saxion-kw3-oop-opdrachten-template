# De `Comparable<T>` interface gebruiken
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Outlined](../resources/star-outlined.svg) 

### Theorie
Bij deze opdracht gaan we de `Comparable<T>` interface gebruiken die standaard in de java bibliotheek zit.
Deze interface kun je gebruiken om twee objecten (vaak van hetzelfde type) met elkaar te vergelijken.
De interface heeft één groot voordeel ten opzichte van de `equals()` methode die standaard in elke klasse zit (en die je ook zelf kunt overschrijven) en dat is dat comparable aangeeft of een object kleiner, gelijk of groter is dan het object waar je het meer vergelijkt.

De `compareTo()` methode geeft:
- Een negatief getal wanneer het `this` object kleiner is dan het meegestuurde object.
- Het getal 0 wanneer de objecten gelijkt zijn.
- Een positief getal wanneer het `this` object groter is dan het meegestuurde object.
De interface kan dus ook gebruikt worden om elementen te sorteren, aangezien de `compareTo()`.

**Hoe implementeer je de interface `Comparable<T>`**<br>
Net als bij de `ArrayList<T>` vul je op de plek van de `T` de klassenaam in van de klasse waar je mee wilt kunnen vergelijken.

Je kunt bijvoorbeeld een vergelijkingsmethode schrijven om objecten van het type `BingoNumber` te vergelijken met andere objecten van het type `BingoNumber` door de interface als volgt te implementeren. 
```java 
public class BingoNumber implements Comparable<BingoNumber> {
    private int number;
    private boolean isCrossedOut;

    @Override
    public int compareTo(BingoNumber other) {
        if (number < other.number) {
            return -1;
        else if (number == other.number) {
            return 0;
        else {
            return 1;
    }
}
```

Je ziet in bovenstaande voorbeeld dat de parameter die meegestuurd is in de `compareTo(BingoNumber other)` methode gelijk is aan de waarde die je hebt ingevuld voor generiek type `T`.
Meer informatie over de Comparable interface kun je vinden via de link onderaan de beschrijving.

### Opdracht: Telefoonboek
We gaan een telefoonboek bouwen waarin we personen opslaan. Het telefoonboek moet gesorteerd worden opgeslagen, zodat we straks eenvoudig het telefoonboek kunnen printen.
De sortering is oplopend op achternaam, voornaam en dan telefoonnummer. Dus bijvoorbeeld:
- Jansen, Jan (0612345678)
- Jansen, Piet (0601234567)
- Pothoven, Tristan (0698765432)
- Pothoven, Tristan (0699999999)

Je ziet hier (net als bij databases), dat we eerst sorteren op achternaam, als er gelijken zijn dan sorteren we op voornaam, en als die ook gelijk zijn dan sorteren we op telefoonnummer.

Bouw het telefoonboek met een print methode die de personen die opgeslagen zijn in het telefoonboek gesorteerd print.
Zorg dat iedere persoon de `Comparable<T>` interface implementeert, zodat je personen met elkaar kunt vergelijken.

### Hints
- Een `ArrayList` kun je sorteren door gebruik te maken van de `Collections.sort()` (zie onderstaande links).
- De `String` klasse heeft ook de `Comparable<T>` geïmplementeerd.

## Relevant links
* [Javadoc Comparable Interface](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html)
* [Javadoc Collections.sort()](https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html#sort(java.util.List))
* [Java documentation SaxionApp](https://saxionapp.hboictlab.nl/nl/saxion/app/SaxionApp.html)
