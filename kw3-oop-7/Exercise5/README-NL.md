# Zoekmachine
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg)  ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg)

Bij de volgende opdracht gaan we de basis van een zoekmachine bouwen. Een zoekmachine bevat een aantal webpagina's die
_gescraped_ zijn. Scrapen betekent dat de broncode van de webpagina gelezen wordt en lokaal, als tekst, wordt
opgeslagen. Een webpagina bevat naast de tekst die je kan lezen ook elementen die gaan over de structuur en de opmaak
van deze pagina (hier leer in andere vakken meer over). Voor een zoekmachine zijn deze elementen echter vervelend: alle 
webpagina's hebben ongeveer dezelfde elementen en als je wil zoeken wil je vooral op de geschreven tekst kunnen zoeken.

Voordat we dus iets met de net _gescrapte_ tekst kunnen doen, zullen we de broncode eerst moeten opschonen (alle
webpagina elementen weghalen zodat je alleen normale tekst over houdt) en verder willen we "onnodige tekst" ook
verwijderen zodat het zoeken makkelijker wordt. (Sommige woorden kan je gewoon uit een zin weglaten omdat deze voor het
begrip van de zin niet nodig zijn.) Voor dat opschonen hebben we een klasse meegeleverd die je hiervoor kan
gebruiken genaamd `TextTools`.

De klasse `TextTools` bevat de volgende hulpmethoden:

- `String getAllTextFromHTML(String htmlPage)`: deze methode geeft van gedownloade webbroncode (html) alle tekst op de
  pagina terug. We houden hierna dus alleen "normale tekst" over.
- `String[] getAllWordsFromHTML(String htmlPage)`: deze methode geeft van gedownloade webbroncode (html) een array terug
  met alle interessante woorden in het document. Hierbij is alle broncode verwijderd en zijn veel voorkomende woorden
  ook verwijderd (zogenaamde stopwoorden).
  
Aangezien het bouwen van een zoekmachine best een redelijk aantal stappen heeft hebben we de opdracht opgesplitst in
een paar delen. We raden je aan om deze opdracht ook in deze stappen te doorlopen.

## Deel 1 - Het modelleren van een webpagina
Elke webpagina die we gaan scrapen dien je te modelleren in een klasse `Webpage` die naast de URL van de pagina ook de
inhoud van deze pagina kan opslaan. Hoe je deze inhoud precies moet gaan opslaan is aan jou om over na te denken: hier 
zijn verschillende mogelijkheden voor, elk met hun eigen voor en nadelen. (Kijk ook vooral naar het return type van de
`getAllWordsFromHTML` methode uit TextUtils als je een voorbeeld nodig hebt.)

Het _downloaden_ van de daadwerkelijke tekst implementeer je in de methode `download`. Je kan hiervoor het gemakkelijkst
de `Scanner` klasse gebruiken, in combinatie met de `URL` klasse. Lees 
[hier](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/net/URL.html) meer over de `URL` klasse in de
officiële documentatie van Java.

De code die voor het downloaden wil gaan gebruiken ziet er ongeveer als volgt uit:
```java
// The URL class can provide us with a "InputStream", which is basically a connection to a website.
InputStream in = new URL("https://www.reddit.com").openStream(); 

// We can then connect the Scanner class to this stream and start reading data, just like you would with a file or
// the console!
Scanner scanner = new Scanner(in);

while(scanner.hasNext()) {
    // Do stuff with this line!
    System.out.println(scanner.nextLine());
}
```
Zorg er voor dat deze `download` methode direct wordt uitgevoerd als je een `Webpage` aanmaakt. (Roep de methode gerust
aan vanuit de constructor!) Mocht er iets misgaan (zowel de klasse URL als de klasse Scanner kunnen exceptions gooien!)
tijdens het downloaden dien je een eigen `WebCrawlerException` te gooien, die de gebruiker van een duidelijke 
foutmelding voorziet.

Implementeer tenslotte een `public int search(String keyword)` methode dat _het aantal keer dat het woord `keyword` 
voorkomt op de pagina_ oplevert. Des te hoger dit getal, des te vaker het woord dus op de pagina te zien is en dus
des te _relevanter_ zal deze pagina zijn voor de zoekmachine!

## Deel 2 - Een overzicht krijgen van _alle_ woorden op een pagina
Vermoedelijk heb je in deel 1 gebruik gemaakt van een lus en heb je _alle woorden in de webpagina bekeken en geteld
hoe vaak het woord voorkwam_. Dit is voor een enkel woord op zich prima, maar vooral bij grote pagina's, wel erg 
"traag". Vaak wordt een webpagina daarom verwerkt en wordt er een _frequentietabel_ opgesteld waarin voor elk woord
wordt opgeslagen _hoe vaak dit woord op de pagina_ voorkomt. En dit is wat je met deze opdracht gaat doen. De meeste
programmeertalen hebben hier gelukkig een _bijzonder nuttig_ datatype voor: de `Map` (soms ook wel "dictionary" genoemd).

Een `Map` kan je het beste vergelijken met een tabel met 2 kolommen: een _key_ kolom en een _value_ kolom. Het fijne
echter van de `Map` klasse is dat deze _generiek_ is (net zoals een `ArrayList` en de `Comparable` interface). Je kan
dus zelf aangeven wat de _typen_ zijn van _key_ en _value_. In deze casus is het logisch om een frequentietabel te maken
van een "woord", samen met "het aantal keren dat dit woord voorkomt" (of te wel: Een String en een Integer).

Als je op zoek gaat naar de klasse `Map` in de officiele documentatie zal je echter zien dat deze klasse uitsluitend als
_interface_ wordt aangeboden, of te wel: wij moeten een klasse gaan gebruiken die een invulling geeft aan deze interface.
Voor de rest van dit vak mag je gebruik maken van de de klasse `HashMap`. (De details voor de keuze laten we achterwegen,
neem van ons aan: dit is een veelgebruikte variant!).

Om terug te komen op de opdracht: We willen dus een frequentietabel bouwen van alle woorden van een pagina, zoals bijv:

| Key        | Value           |
| ------------- |:-------------:|
| trending      | 6 |
| ago      | 6      |
| reddit | 3      |
| join   | 9 |
| ...   | ... |

Bestudeer de klasse `HashMap` en `Map` aandachtig:
* [Java Map](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html)
* [Java HashMap](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/HashMap.html)

Merk op dat een heleboel methoden je bekend voor zullen komen, zoals `remove`, `size`, `clear`, maar dat bepaalde methoden
ook net wat anders heten dan bijv. bij een `ArrayList`. `add` heet bijvoorbeeld nu `put`, `set` (om dingen aan te passen)
heet nu `replace`, etc. Je zal dus even moeten wennen aan het gebruik van maps en de methoden die je hiervoor moet aanroepen.
De basisfunctionaliteit (toevoegen, verwijderen, ophalen, etc.) zit er uiteraard gewoon in!

De bovenstaande tabel maak je als volgt m.b.v. van een `HashMap`:
```java
// Note the definition of the table below: all KEYS must be of type String, all VALUES of type Integer.
HashMap<String, Integer> myTable = new HashMap<>();

// put has the following form: "put(key, value)"
myTable.put("trending", 6); // Note that put requires the FIRST argument to be a String, the second to be an Integer.
myTable.put("ago", 6);
myTable.put("reddit", 3);
myTable.put("join", 9);
// etc.
```

Je kan eenvoudig data weer uit een `HashMap` halen door de `get` methode aan te roepen, bijv:
```java
int nrOfOccurences = myTable.get("ago"); // should be 6!
```

Of data aanpassen door middel van:
```java
myTable.replace("ago", 8); // "ago" has now 8 occurences!
```

Schrijf nu zelf een methode `public HashMap<String, Integer> getWordFrequencies()` methode in de klasse `Webpage` die
je kan gebruiken om een overzicht te krijgen van alle woorden, en hun voorkomens, van een bepaalde website. Update
eventueel je `search` methode om deze gebruik te laten maken van de frequentietabel. 

Als alles goed is gegaan zal het volgende (ongeveer) getoond worden:
```text
The word [trending] occured 2 time(s) on https://www.reddit.com/.
The word [ago] occured 6 time(s) on https://www.reddit.com/.
The word [reddit] occured 3 time(s) on https://www.reddit.com/.
The word [join] occured 9 time(s) on https://www.reddit.com/.
```

## Deel 3 - Uitdaging: Je eigen zoekmachine
Nu de voorbereidingen afgemaakt zijn, kunnen we de klasse `Webpage` gaan gebruiken in onze eigen `SearchEngine` klasse.

Schrijf een klasse `SearchEngine` met de volgende functionaliteit:
- `void addWebPage(String url)`: om een webpagina toe te voegen aan de zoekmachine. Als er iets mis gaat met het downloaden
  van deze pagina, zal er een `WebCrawlerException` gegooid worden zoals eerder genoemd bij opdracht 1.
- `HashMap<Webpage, Integer> getSearchResults(String keyword)`: om een map te krijgen waarin per, `Webpage` wordt 
  opgeslagen, hoe vaak `keyword` voorkomt op deze pagina.
  
Een mogelijke uitvoer kan zijn:
```text
Printing out the results for the keyword [saxion]

https://www.saxion.edu/: 12
https://www.saxion.nl/: 14
```

Je hebt nu je eigen zoekmachine gebouwd! Uiteraard is deze versie nog niet zo goed als die van Google, maar het begin is
er! 

Om het nu echt mooi te maken wil je eigenlijk de resultaten ook nog "op de juiste volgorde" zetten, maar hier loop
je gelijk tegen een probleem aan: een `Map` is namelijk niet direct te sorteren. We zullen dus _zelf_ de resultaten
op een juiste manier in een lijst moeten zetten. Maar deze uitdaging laten we graag aan jullie _zelf_ over.

## Deel 4 - Uitdaging: Het ordenen van de zoekresultaten
Schrijf een eigen methode `public ArrayList<Webpage> search(String keyword)` die van een gegeven keyword een lijst van
webpagina's zal opleveren in volgorde van relevantie. De pagina met de meeste "hits" (aantal keren dat een zoekterm 
voorkomt) staat dus op de eerste positie, etc.