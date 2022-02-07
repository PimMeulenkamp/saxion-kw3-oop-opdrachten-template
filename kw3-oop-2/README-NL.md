# Complexere datastructuren

Competentie: _Ik kan programma's schrijven die compositie in het klassenontwerp gebruiken, en ben in staat eventuele fouten af te handelen met exceptions._

De opdrachten kunnen gevonden worden in de losse modulen.

# Introductie

Afgelopen week hebben we de basisprincipes van _encapsulatie_ gebruikt om klassen verantwoordelijkheden te geven. Denk
hierbij bijv. aan het voorbeeld van de klasse `Person` die, door het toevoegen van getters / settters en constructoren,
verantwoordelijk is gemaakt voor het goed bijhouden van een interne toetsand (_state_). Ongeldige toestanden, zoals
bijv. negatieve leeftijden of namen die niet ingevuld zijn, zijn hiermee voorkomen.

Doordat we nu in staat zijn klassen eigen verantwoordelijkheden te geven, is het ook mogelijk om grotere applicaties te
bouwen die gebruik maken van deze klassen. (De logica in de klassen is immers nu eenvoudig herbruikbaar!) Deze week gaan wij kijken naar hoe je dit doet en wat hier bij komt
kijken. We gaan kijken naar het gebruik van klassen in een groter geheel. Ook gaan we in op hoe foutafhandeling werkt en
hoe je, als klasse, kan aangeven dat er of iets fout is gegaan of dreigt te gaan. Dit doen we door te kijken naar _exceptions_.

Voordat we hier echter aan kunnen beginnen is het verstandig om eerst een nieuw concept te introduceren: _overloading_.

## Overloading: Constructors en methoden

Zoals je misschien al gemerkt hebt is naamgeving enorm belangrijk in het programmeren. Het helpt je om duidelijk te
snappen hoe iets werkt en kan helpen met verwachtingen te gaan scheppen over wat iets doet. Neem bijvoorbeeld de
methode `printLine` die je nu al regelmatig gebruikt hebt. Deze methode stelt je in staat om iets te printen, maar
accepteert allerlei argumenten, zoals een _int_, een _double_, een String, etc.

 ```java
int number = 7;
String sentence = "Hello";

SaxionApp.printLine(number);
SaxionApp.printLine(sentence);
 ```

Waar je misschien nog niet over na had gedacht is hoe je deze `printLine` nu precies moet definieren als je deze zelf
zou willen schrijven. Zoals je weet moet je, zodra je een methode schrijft, aangeven welke argumenten deze
verwacht en deze argumenten mogen slechts 1 type hebben. Om bovenstaande functionaliteit dus te kunnen implementeren, *moet* je dus wel 2 verschillende soorten methoden hebben. Methoden
mogen gelukkig wel _dezelfde_ naam hebben, met als resultaat dat je onderstaande methoden in dezelfde klasse kan hebben:

```java
public void printLine(int number) {...}
public void printLine(double number) {...}
public void printLine(String text) {...}
public void printLine(boolean someBoolean) {...}
```

Het bovenstaande principe, waarbij je vier methoden hebt met _exact_ dezelfde naam, maar met verschillende argumenten wordt
ook wel _method overloading_  genoemd. _Method overloading_ is een concept waarin je een methode (met vergelijkbare
functionaliteit) dezelfde naam geeft, zolang het type van de argumenten maar verschillen. Het is dus niet toegestaan om alleen de naam van de argumenten te veranderen.

We noemen dit ook wel formeel dat de _handtekening_ (signature) van de methode anders moet zijn: `printLine(int)` is
anders dan `printLine(double)`, dat weer anders is dan `printLine(String)`, etc.

### Het implementeren van overloaded methoden

Als de naam van een methode gelijk is, verwacht je dat de functionaliteit van deze methoden
ongeveer gelijk is. En niets is minder waar.. _overloaded_ methoden delen waarschijnlijk een groot deel van bepaalde
functionaliteit. Afhankelijk van de reden waarvoor je _method overloading_ wil toepassen kan je zomaar te maken hebben
met een situatie waarin codeduplicatie onvermijdelijk lijkt, maar dit zeker niet is. Je kan namelijk binnen een methode
eenvoudig een andere methode aanroepen met misschien vergelijkbare functionaliteit.

Laten we dit eens bekijken aan de hand van een voorbeeld. Stel dat je deze overloaded methoden hebt gemaakt:

```java
public void printLine(String sentence) {
    // Do fancy stuff to get the sentence on the screen..
}

public void printLine(int number) {
    // Do highly similar fancy stuff to get the number on the screen..
}
```

Dan kan je er natuurlijk ook voor kiezen om de ene methode de ander te laten gebruiken! Dit ziet er als volgt uit:

```java
public void printLine(String sentence) {
    // Do fancy stuff to get the sentence on the screen..
}

public void printLine(int number) {
    String numberInStringFormat = "" + number; // Convert number from type int to a String
    printLine(numberInStringFormat); // Call the printLine method that takes a String and let it handle this printLine!
}
```
Het grote voordeel van bovenstaande oplossing is dat je nu je "fancy code" maar op 1 plek hebt staan,
namelijk in de `printLine(String)` methode. Mocht er dus een foutje zitten in `printLine(..)` (of wil je de boel aanpassen), hoef je dit slechts op 1 plek te doen. Dit soort oplossingen worden erg vaak gebruikt in het programmeren en het is goed om vanaf nu hier over na te gaan denken: voorkom codeduplicatie!

Tenslotte nog 1 voorbeeld om te laten zien hoe overloading in een net iets andere setting gebruikt kan worden:

```java
public void print(Person p) {
    // Do something fancy... 
}

public void print(ArrayList<Person> persons) {
    for(Person p:persons) {
        print(p); // Invoke the print(Person) method
    }
}
```

Op deze manier kan je bijv. een lijst van objecten van een bepaald type, eenvoudig combineren met de methode die slechts 1 instantie tegelijkertijd aankan!

### Overloaded constructors

Naast methoden kan je ook constructors overloaden. Dit is handig als je (bijv.) standaardwaarden wil opnemen en deze
niet altijd wil meegeven. Bekijk het volgende voorbeeld:

```java
public class TrainCompartment {
    private int numberOfSeats;
    private int numberOfSeatsInUse;

    public TrainCompartment(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;

        numberOfSeatsInUse = 0; // This line is a duplicate!
    }

    public TrainCompartment() {
        this.numberOfSeats = 50; // Default value!

        numberOfSeatsInUse = 0; // This line is a duplicate!
    }
}
```

Door het toevoegen van twee constructors aan deze klasse is het opeens mogelijk geworden om de klasse `TrainCompartment`
op twee manieren te instantieren, namelijk:

```java
TrainCompartMent tc1 = new TrainCompartment();
TrainCompartMent tc2 = new TrainCompartment(100);
```

Het verschil zit hem in uiteraard in wat er nu gebeurd met de interne toestand van `TrainCompartment`. `tc1` zal in dit geval de standaard 50 stoelen kennen, `tc2` zal voorzien worden van 100 stoelen. De keuze is dus nu aan de programmeur: Je mag je eigen aantal stoelen kiezen of kiezen voor een default oplossing!

Er zit nog wel een slordigheid in bovenstaande uitwerking! Dit komt dat er dubbele code opgenomen is waar we nog
van af willen. (In dit geval is het maar 1 regel, maar in de toekomst kunnen dit er veel meer zijn!) In het geval van
constructoren moet je, om een andere constructor aan te roepen, gebruik maken van het woordje `this(...)`. Je hebt namelijk geen methodenaam die je nu even kan gebruiken. 
Dit ziet er als volgt uit:

```java
public class TrainCompartment {
    private int numberOfSeats;
    private int numberOfSeatsInUse;

    public TrainCompartment(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;

        numberOfSeatsInUse = 0; // This line WAS a duplicate!
    }

    public TrainCompartment() {
        this(50); // Invoke the other constructor that requires an integer, providing 50 (the default value) as an argument.
    }
}
```

Op deze manier kunnen we eenvoudig constructors overloaden, zonder daarbij codeduplicatie te krijgen!

## Het gebruik van *compositie*

Doordat we klassen nu meer verantwoordelijkheden kunnen geven, kunnen we ook gaan nadenken over een complexere opbouw
van onze programmas. Als voorbeeld gaan we daarom een opdracht van vorige week (opdracht 1, het treinstel) verder
uitwerken. We gaan de klasse `TrainCompartment` gebruiken om een volledige klasse `Train` te schrijven. Het is immers goed
denkbaar dat als je passagier "in de trein" wil stappen, je mogelijk een zitplek moet vinden en dat je daarvoor
meerdere `TrainCompartments` moet doorlopen. Een `Train` bevat dus een lijst van `TrainCompartments`. In objectoriëntatie 
heet dit "compositie".

Het is in deze opzet niet ondenkbaar dat de methode `enter()` die je eerder gemaakt hebt voor de klasse `TrainCompartment` ook
wel eens nuttig zouden kunnen zijn voor de gehele trein. Je wil immers meestal een zitplek hebben "in de trein" en niet
uitsluitend beperkt worden tot 1 treinstel. We kiezen er dus voor om ook in de klasse `Train` een `enter()` methode op
te nemen.

Bekijk de volgende `Train` implementatie:

```java
public class Train {

    ArrayList<TrainCompartment> compartments;

    public Train(int nrOfCompartments) {
        compartments = new ArrayList<>();

        // Initialize compartments
        for (int i = 0; i < nrOfCompartments; i++) {
            TrainCompartment newCompartment = new TrainCompartment();

            compartments.add(newCompartment);
        }
    }

    public void enter() {
        for (TrainCompartment tc : compartments) {
            if (!tc.isFull()) { // If there is room in the compartment
                tc.enter(); // Enter it..
                break; // Stop the loop: We found a seat!
            }
        }
    }

    // Omitted other code.
}
```

(Merk op dat wij wel een hulpmethode `isFull()` in de klasse `TrainCompartment` hebben toegevoegd die controleert of er nog wel plek
is in dit treinstel.)

We gebruiken nu de klasse `TrainCompartment` als bouwblok om onze gehele `Train` te kunnen maken. We spreken nu ook wel
van het feit dat de objecten `TrainCompartment` ge"contained" worden in het object `Train`. Een `Train` is samengesteld ("composed")
uit een of meerdere `TrainCompartment`s, en is er afhankelijk van geworden.

Door het toevoegen van de `enter()` methode is het nu mogelijk om (als passagier / gebruiker van de klasse `Train`)
eenvoudiger een plek in de gehele trein te vinden. De klasse `Train` is immers nu verantwoordelijk geworden voor het
vinden van een plek in de trein waar een passagier plaats kan nemen. (Je hoeft dus eigenlijk ook geen getter meer aan 
te bieden voor de variabele compartments!) 

Maar wat nu als er geen plek is? En kan een trein ook *geen* treinstellen hebben? Nog steeds kunnen er dingen fout gaan
en op dit moment lossen wij deze fouten vooral op door een foutmelding _te printen_ naar de gebruiker. Maar er is ook een
manier waarop wij op programmeerwijze kunnen omgaan met fouten, een manier dus waarop wij in onze code kunnen aangegeven
dat er is mis gaat en wat je dan moet doen om dit op te lossen.

Hiervoor hebben de meeste object georienteerde programmeertalen eenzelfde oplossing bedacht: _Exceptions_.

## Foutafhandeling: Exceptions

Een exception, letterlijk vertaald: uitzondering, en _exception handling_, letterlijk: het afhandelen van uitzonderingen is de manier hoe binnen het programmeren met
fouten wordt omgegaan op basis van code. We gaan dus niet langer meer foutmeldingen alleen maar printen aan de gebruiker,
maar er echt voor zorgen dat ons programma ook weet dat er een fout is opgetreden. Een exception kan je het beste zien 
als "een fout" (of een probleem) dat op een bepaalde manier opgelost wordt. Als er ergens een fout optreedt, dan wordt 
er (zo zeggen we dit) _een exception gegooid_. Nadat een exception is gegooid moet deze ook ergens worden opgevangen, 
ook wel het _catchen van een exception_ genoemd. "Throw" en "catch" zijn de termen die je hier veel zal aantreffen en 
in dit hoofdstuk zullen we uitleggen wat dat betekent.

### Het gooien van Exceptions

Laten we gelijk beginnen met een voorbeeld, aan de hand van de eerder opgestelde `TrainCompartment`. Bekijk de volgende
code:

```java
public class TrainCompartment {
    private int numberOfSeats;
    private int compartmentClass;
    private int numberOfSeatsInUse;

    // Cut out some code..

    public void enter() {
        if (numberOfSeatsInUse < numberOfSeats) {
            numberOfSeatsInUse++;
        } else {
            // Produce some kind of error!
            SaxionApp.printLine("The compartment is full!");
        }
    }

    // Cut out some more code..
}
```

In bovenstaande fragment zie je de `enter()` methode die controleert of er plek is in dit treinstel. Als dit niet het
geval is, zal er een foutmelding worden getoond. Voor de gebruiker is dit zeker prettig, maar voor je programma zal
de `enter()` methode nadat de melding is geprint gewoon doorgaan en eigenlijk is er verder niets aan de hand: Er is
immers niets fout gegaan in de code!

Als we ook onze programmatuur echt een fout willen laten "gooien" waar we als programmeur verder op kunnen reageren,
moeten we een exception gaan gooien. Het gooien van een exception breekt de uitvoer van een methode (de methode wordt
dus niet verder afgemaakt) en er wordt een bericht naar de aanroepende methode gestuurd. Dit ziet er als volgt uit:

```java
public void enter(){
    if (numberOfSeatsInUse<numberOfSeats) {
        numberOfSeatsInUse++;
    } else {
        // Produce some kind of error!
        throw new IllegalStateException("There are no more seats available!");
    }
}
```

Merk op dat het woord `throw` daadwerkelijk een _keyword_ is in Java, net zoals _if_ en _for_, etc. Het doel van 
_throw_ is om daadwerkelijk een foutmelding te "gooien". Een exception zelf is eigenlijk gewoon een klasse binnen 
Java met verschillende subsoorten (hier komen we later op terug), maar als je de exception wil gaan gooien, gooi je 
een normaal object net zoals `Train` en `TrainCompartment`. Het woordje `new` is dus verplicht om een exception te 
instantieren. Elke exception gooi je dus op de volgende manier: `throw new <NaamVanException>`. De constructor van 
de klasse IllegalStateException stelt ons in staat een bericht (in String vorm) mee te geven zodat deze later geprint 
kan worden. Daarnaast gooi je eigenlijk nooit een standaard exception, maar probeer je deze altijd zo specifiek mogelijk 
te maken. Hier komen we later nog wel op terug.

Voor de opdrachten van deze week maak je gebruik van 2 mogelijke exceptions:

* `IllegalStateException` Deze foutmelding gooi je als je programma / het object in een toestand is gekomen
  waardoor de methode niet meer aangeroepen mag worden. In het geval van het vorige voorbeeld wordt deze exception
  gegooid om aan te geven dat de trein vol is en er geen stoelen meer vrij zijn. Je gebruikt deze exception als volgt:
  ```java
  // At the place you found a problem, use:
  throw new IllegalStateException("You can provide a message here!");
  ```
* `IllegalArgumentException` Deze foutmelding mag je gooien als de parameter van je methodeaanroep ongeldig is. Denk
  bijv. terug aan de klasse persoon met een `setAge(int age)` methode, waarbij je een negatieve leeftijd invult. Dit is
  een waarde die niet logisch is (ga maar na: wat is een negatieve leeftijd?) en dus verdient het een foutmelding.
  ```java
  // Whenever you conclude a provided argument is illegal
  throw new IllegalArgumentException("You can provide a message here!");
  ```

Ook in ons treinvoorbeeld zit een mogelijke `IllegalArgumentExeception` verscholen, kijk maar eens naar de constructor:

```java
public Train(int nrOfCompartments) {
    compartments=new ArrayList<>();
  
    // Initialize compartments
    for(int i=0;i<nrOfCompartments; i++) {
        TrainCompartment newCompartment=new TrainCompartment();
  
        compartments.add(newCompartment);
    }
}
```

Als we besluiten dat het niet is toegestaan om geen compartments te hebben (dus `nrOfCompartments > 0` moet gelden), dan
kunnen we in het geval dat dit niet zo is een _IllegalArgumentException_ gooien. De vernieuwde constructor kan er als volgt uit zien:

```java
public Train(int nrOfCompartments) {
    if(nrOfCompartments<=0) {
          throw new IllegalArgumentException("nrOfCompartments must be > 0!"); // If this exception is thrown, the constructor will end.
    }
  
    compartments=new ArrayList<>();
  
    // Initialize compartments
    for (int i=0;i<nrOfCompartments; i++) {
        TrainCompartment newCompartment=new TrainCompartment();
    
        compartments.add(newCompartment);
    }
}
```

Merk in dit geval op dat na het gooien van de Exception, de constructor wordt afgebroken: er zal geen nieuwe instantie `Train` gemaakt worden.

### Het vangen van Exceptions

Zodra je een van de twee boven genoemde exceptions gooit, wil je vaak deze ook ergens gaan afhandelen. Je moet je voorstellen
dat een exception wordt "overgegooid" van methode naar methode. Stel dat een `run()` methode
de methode `enter()` aanroept, dan zal de exception (als deze wordt gegooid) worden gegooid van `enter()` naar `run()`
In de `run() `methode kan je vervolgens beslissen om of de exception te vangen of deze voorbij te laten gaan. In het 
laatste geval zal de methode die de `run()` aanroept de exception moeten afhandelen, anders zal je applicatie gewoon crashen. Voor nu gaan we exceptions
onmiddelijk afvangen op het moment dat ze gegooid worden.

Gegeven de `enter()` methode die hier boven staat, dan kan je de exception die (mogelijk) gegooid wordt als volgt opvangen:

```java
public void run(){
    Train myTrain = new Train();

    try{
        myTrain.enter(); // This method could potentially "throw" an exception, so we are going to TRY it and possibly catch the exception!
    } catch (IllegalStateException ise) {
        SaxionApp.printLine(ise);
    }
}
```

Letterlijk mag je bovenstaande code lezen als: _Probeer de methode ... uit te voeren en ALS er een exception wordt
gegooid, vang deze en geef het de naam "ise" en print vervolgens de foutmelding uit._

Merk vooral op dat de methodeaanroep `enter()` nu is opgenomen in een nieuwe constructie dat er uit ziet
als `try {... } catch (IllegalStateException ise)`. De accolades worden gebruikt om blokken code aan te geven,
vergelijkbaar met if-statements en loops. Het `catch (..)` blok wordt gebruikt als een opvangbak voor eventuele
foutmeldingen die worden gegenereerd uit de code na `try { .. }`. De code die je in het catch-blok toevoegt wordt alleen uitgevoerd als er daadwerkelijk een exception wordt gevangen.
Voor alle accolades geldt dat je uiteraard ook meer regels code mag schrijven. De naam "ise" voor de exception is tenslotte vrij gekozen, maar is afgeleid van de <ins>I</ins>llegal<ins>S</ins>tate<ins>E</ins>xception.

Voor een IllegalArgumentException gaat hetzelfde op, maar schrijf je `catch (IllegalArgumentException iae)`. In het catch-blok moet je immers aangeven wat voor soort exception je precies verwacht te ontvangen. 

## Videos

[![Constructor overloading](http://img.youtube.com/vi/DXmTRY4Sysw/0.jpg)](http://www.youtube.com/watch?v=DXmTRY4Sysw)
[![IllegalArgument en IllegalStateExceptions](http://img.youtube.com/vi/pZLCdSH02Es/0.jpg)](http://www.youtube.com/watch?v=pZLCdSH02Es)


## Een groter voorbeeld
Ter afsluiting laten we een groter voorbeeld zien van de trein casus die je kan bestuderen ter voorbereiding van de lessen.
Neem de code goed door en probeer vooral te snappen waarom en hoe wij bepaalde dingen gedaan hebben. Mocht je vragen hebben over de code,
stel deze dan gerust!

Passenger.java
```java
public class Passenger {
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

TrainComparment.java
```java
public class TrainCompartment {
    private int numberOfSeats;
    private int compartmentClass;

    private ArrayList<Passenger> listOfPassengers;

    public TrainCompartment(int nrOfSeats, int compartmentClass) {
        if(!(compartmentClass == 1 || compartmentClass == 2)) {
            throw new IllegalArgumentException("Compartment class cannot be anything other than 1 or 2");
        }
        
        if(nrOfSeats <= 0) {
            throw new IllegalArgumentException("nrOfSeats must be at least 1");
        }
        
        this.numberOfSeats = nrOfSeats;
        this.compartmentClass = compartmentClass;

        listOfPassengers = new ArrayList<>();
    }

    public TrainCompartment() {
        this(50, 2);
    }

    public boolean isFull() {
        return listOfPassengers.size() < numberOfSeats;
    }

    public void enter(Passenger somePassenger) {
        if (isFull()) {
            throw new IllegalStateException("The compartment is full!");
        }

        listOfPassengers.add(somePassenger);

    }

    public int getNumberOfSeatsInUse() {
        return listOfPassengers.size();
    }

    public void leave(Passenger somePassenger) {
        if(!hasPassenger(somePassenger)) {
            throw new IllegalStateException("This passenger is not in this compartment!");
        }

        listOfPassengers.remove(somePassenger);
    }

    public boolean hasPassenger(Passenger somePassenger) {
        return listOfPassengers.contains(somePassenger);
    }

    /**
     * Instead of returning the actual list (that can be manipulated), we'll just return a list of names!
     * Alternatively, we could return a copy of listOfPassengers. We just want to keep our data safe!
     * @return a list of all passenger names.
     */
    public ArrayList<String> getListOfPassengerNames() {
        ArrayList<String> result = new ArrayList<>();

        for(Passenger p : listOfPassengers) {
            result.add(p.getName());
        }

        return result;
    }

    @Override
    public String toString() {
        return "There are currently " + getNumberOfSeatsInUse() + " seats in use out of a total of " + numberOfSeats + " on the train compartment with class " + compartmentClass + ".";
    }
}
```

Train.java
```java
public class Train {

    ArrayList<TrainCompartment> compartments;

    public Train(int nrOfCompartments) {
        if(nrOfCompartments <= 0) {
            throw new IllegalArgumentException("nrOfCompartments cannot be less or equal to 0");
        }

        compartments = new ArrayList<>();

        // Initialize compartments
        for (int i = 0; i < nrOfCompartments; i++) {
            TrainCompartment newCompartment = new TrainCompartment();

            compartments.add(newCompartment);
        }
    }
    
    public Train() {
        this(5);
    }

    public void enter(Passenger somePassenger) {
        for (TrainCompartment tc : compartments) {
            if (!tc.isFull()) { // If there is room in the compartment
                tc.enter(somePassenger); // Enter it..
                break; // Stop the loop: We found a seat!
            }
        }
    }

    public void leave(Passenger somePassenger) {
        for (TrainCompartment tc : compartments) {
            if (tc.hasPassenger(somePassenger)) { // If the passenger is in that compartment
                tc.leave(somePassenger); // Remove the passenger from the compartment.
                break; // Stop the loop: The passenger got off the train
            }
        }

        // We won't report an error if the passenger was never on board: We'll just ignore it.
    }
}
```