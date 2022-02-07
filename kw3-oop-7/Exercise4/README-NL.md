# De informatiseringshelpdesk I-desk
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) 

Bij een groot bedrijf kunnen alle werknemers (users) hulp krijgen van de Informatiseringshelpdesk (kort: I-desk) voor 
problemen die te maken hebben met de IT hulpmiddelen die geïnstalleerd zijn op hun werkplek. Voor deze opdrachten gaan
we een meldingssysteem maken wat een onderscheid kan maken tussen hardware en software problemen.

Om een probleem te kunnen melden, moet de werknemer eerst inloggen op het I-desk systeem in de rol van (gewone) gebruiker 
(`user`). Een gebruiker kan inloggen met een reeds eerder opgeslagen gebruikersnaam en wachtwoord (zie `users.csv`). 
Uiteraard moet het systeem controleren dat het wachtwoord overeenstemt het wachtwoord dat hoort bij de gegeven 
gebruikersnaam voordat een gebruiker daadwerkelijk is ingelogd.

Nadat een gebruiker op het I-desk systeem is ingelogd kan deze gebruiker een probleem melden door een _ticket_ aan te maken 
waarin het probleem wordt vastgelegd. Een ticket heeft binnen het systeem altijd een uniek nummer, een datum en tijdstip van 
de melding en een beschrijving. De datum en tijd van de melding worden automatisch bepaald bij het aanmaken van het ticket. Als 
het probleem een hardware gerelateerd probleem is, dan moet de code (een `String`) van de hardware ingevoerd worden die het 
betreft. In het geval dat het probleem software gerelateerd is, moet de naam van het softwarepakket worden opgegeven.

Naast het aanmelden van een ticket kan een gebruiker ook een lijst van zijn eigen tickets opvragen.

In het bestand `tickets.csv` kun je enkele tickets vinden die je moet importeren in je eigen systeem.

Uiteraard zijn er ook mensen die deze problemen kunnen oplossen; de helpdeskmedewerkers (`Troubleshooters`). Dit zijn een 
speciaal soort gebruikers waarvan ook wordt vastgelegd wat hun expertise is en voor welke afdeling ze werken. Deze staan 
eveneens in het hiervoor genoemde `users.csv` bestand. Zij kunnen uiteraard op hetzelfde systeem inloggen, zelf tickets 
inschieten en een lijst van alle eigen tickets opvragen; zij zijn immers ook medewerkers.

Helpdeskmedewerkers kunnen daarnaast een overzicht opvragen van _alle_ tickets die bekend zijn in het systeem evenals de 
lijst van openstaande tickets. 

Daarnaast kunnen zij ook een ticket afhandelen. De helpdeskmedewerker dient dan in een korte beschrijving aan te geven 
wat het probleem was en hoe deze is afgehandeld. Met het sluiten van een ticket wordt in dit ticket automatisch de
datum en tijd van afmelden en de betrokken helpdeskmedewerker vastgelegd.

Om op weg te komen hebben wij alvast de `Application` klasse beschreven en een opzetje gemaakt van de klasse `Helpdesk`. 
De `Application` klasse bevat de interface die je mag gebruiken voor deze opdracht. Hier hoef je verder niets meer aan te doen. 
De opdracht zit hem vooral in het uitwerken van de klasse `Helpdesk`.

Mocht er nu een fout optreden in de `Helpdesk`, dan dien je hier een eigen gemaakte exception `HelpdeskException` te gooien.
In onze voorbeeldcode kun je vinden waar wij deze ("Checked Exception") mogelijk verwachten.

## Hints
* Begin eenvoudig: denk na over de klassen voor de gebruikers (`User`) en de helpdeskemployee (`Troubleshooter`). Begin daarna 
  aan de klasse `Ticket`.
* Werk van "versie naar versie". Het is redelijk eenvoudig om het spoor kwijt te raken in deze opdracht, probeer daarom
  zoveel mogelijk kleine stappen te nemen.
* De dataset met bestaande tickets is best lastig in te lezen (vanwege o.a. de datums). Begin daarom eerst _zonder_ deze
  dataset en ga pas data inlezen als je hier aan toe bent. Je kunt prima eerst het gehele systeem bouwen, zonder deze
  data te importeren. (Dit gaat natuurlijk ook op voor de gebruikers!)
* In de klasse `Helpdesk` hebben wij een `public static final DateFormatter` toegevoegd die je kunt gebruiken om eenvoudig
  zelf een datum en tijd uit te printen in een bepaald formaat. Je kunt deze instantie gebruiken om elke `LocalDateTime`
  instantie om te zetten naar een goed leesbare `String`. Dit doe je door de volgende aanroep:
  ```java
    String result = someDateTimeInstance.format(Helpdesk.ticketFormatter)`. 
  ```
  Lees vooral de documentatie als je hier verder twijfels over hebt!
* Om een double af te ronden op twee decimalen (om bijv. het aantal uren te berekenen dat een Ticket open heeft gestaan) kun 
  je de volgende "truc" gebruiken:
  ```java
  private double roundOff(double input) {
      return Math.round(input * 100.0) / 100.0;
  }
  ```

# Voorbeeld
Om dit programma goed te kunnen begrijpen hebben wij de flow opgebroken in een aantal aandachtspunten. Zaken die wij
niet helder hebben beschreven mag je op een eigen manier invullen.

## Inloggen met verkeerde gegevens
```text
Read: 16 objects.

-----------
I-Desk
-----------
Please give your username: Tristan
Please give your password: thisIsNotMyPassword
ERROR: Cannot login user. Invalid credentials
```

## Inloggen als een "normale" gebruiker
```text
-----------
I-Desk
-----------
Please give your username: Tristan
Please give your password: test

-----------
I-Desk
-----------
1. Add ticket
2. Show my tickets
9. Logout
0. Exit

Choice: 2
-----------
Show my tickets:
***** Ticket 3 [RESOLVED] *****
Reported by: Tristan
Reported time: 03-05-2018 08:15:06
Issue: I am stuck at level 15 of Angry Birds

Resolved by: Erik [Troubleshooter] Lecturer, HBO-ICT
Solution: Stop fooling around and get back to work. BTW: touch the screen twice to let the blue birds split.
Solved time: 04-05-2018 11:45:12
Duration: 27.5 hours

-----------
I-Desk
-----------
1. Add ticket
2. Show my tickets
9. Logout
0. Exit

Choice: 1
-----------
Add ticket:
Please enter the type (hardware or software):
hardware
Please enter the description:
My cat destroyed my mouse.
Please enter the machine id:
machine-tpo
New ticket is created with number: 7

-----------
I-Desk
-----------
1. Add ticket
2. Show my tickets
9. Logout
0. Exit

Choice: 3
-----------
Show my tickets:
***** Ticket 3 [RESOLVED] *****
Reported by: Tristan
Reported time: 03-05-2018 08:15:06
Issue: I am stuck at level 15 of Angry Birds

Resolved by: Erik [Troubleshooter] Lecturer, HBO-ICT
Solution: Stop fooling around and get back to work. BTW: touch the screen twice to let the blue birds split.
Solved time: 04-05-2018 11:45:12
Duration: 27.5 hours

***** Ticket 7 [UNRESOLVED] *****
Reported by: Tristan
Reported time: 24-03-2021 10:50:38
Issue: My cat destroyed my mouse.
```

Merk op dat de nieuwe ticket (7) natuurlijk nog geen oplossing bevat, omdat deze alleen nog maar is aangemaakt!

## Probeer helpdeskmedewerker menu optie als gewone gebruiker
```text
-----------
I-Desk
-----------
1. Add ticket
2. Show my tickets
9. Logout
0. Exit

Choice: 5
-----------
Show all tickets:

-----------
I-Desk
-----------
1. Add ticket
2. Show my tickets
9. Logout
0. Exit

Choice: Current user has not enough privileges to perform this action
```
_**Let op**_: We hebben het nu zo gemaakt dat de `Applicatie` klasse niet controleert op een geldige keuze, maar 
gewoon aan de `Helpdesk` klasse vraagt om bij keuze "5" de lijst van alle tickets te tonen. `Helpdesk` constateert echter 
dat een gewone gebruiker geen rechten heeft dit te doen en geeft dan ook een foutmelding (in het rood). Deze komt echter pas 
later in beeld dan het opnieuw tonen van het menu. Hier hoef je je verder geen zorgen over te maken.

## Inloggen als helpdeskmedewerker
Let op: We zijn nog steeds ingelogd als gebruiker _Tristan_, dus we moeten eerst even uitloggen!
```text
-----------
I-Desk
-----------
1. Add ticket
2. Show my tickets
9. Logout
0. Exit

Choice: 9
-----------

-----------
I-Desk
-----------
Please give your username: Erik
Please give your password: test

-----------
I-Desk
-----------
1. Add ticket
2. Show my tickets
3. Resolve ticket
4. Show open tickets
5. Show all tickets
6. Show users
9. Logout
0. Exit

Choice: 3
-----------
Resolve ticket:
Please enter the ticket number:
7
Please enter the response:
Buy a new mouse!

-----------
I-Desk
-----------
1. Add ticket
2. Show my tickets
3. Resolve ticket
4. Show open tickets
5. Show all tickets
6. Show users
9. Logout
0. Exit

Choice: 4
-----------
Show open tickets:
***** Ticket 2 [UNRESOLVED] *****
Reported by: Steven
Reported time: 14-11-2019 14:45:35
Issue: My computer contains MacOS, but I am a Windows user...

***** Ticket 5 [UNRESOLVED] *****
Reported by: Vincent
Reported time: 03-03-2020 08:00:01
Issue: Help, my computer contains a virus. Is it contagious to humans?

***** Ticket 6 [UNRESOLVED] *****
Reported by: Ruud
Reported time: 05-01-2021 17:15:23
Issue: I bought a red inktjetprinter. Why does it only print in grayscale?

```
Deze tickets stonden al in het bestand en zijn al jaren niet afgesloten!

```text
-----------
I-Desk
-----------
1. Add ticket
2. Show my tickets
3. Resolve ticket
4. Show open tickets
5. Show all tickets
6. Show users
9. Logout
0. Exit

Choice: 5
-----------
Show all tickets:
***** Ticket 1 [RESOLVED] *****
Reported by: Evert
Reported time: 03-12-2019 10:15:30
Issue: Where is the power button of my computer?

Resolved by: Oliver [Troubleshooter] Lecturer, HBO-IT
Solution: The powerbutton is on the backside of the Macintosh machine.
Solved time: 15-12-2019 10:05:23
Duration: 287.83 hours

***** Ticket 2 [UNRESOLVED] *****
Reported by: Steven
Reported time: 14-11-2019 14:45:35
Issue: My computer contains MacOS, but I am a Windows user...

***** Ticket 3 [RESOLVED] *****
Reported by: Tristan
Reported time: 03-05-2018 08:15:06
Issue: I am stuck at level 15 of Angry Birds

Resolved by: Erik [Troubleshooter] Lecturer, HBO-ICT
Solution: Stop fooling around and get back to work. BTW: touch the screen twice to let the blue birds split.
Solved time: 04-05-2018 11:45:12
Duration: 27.5 hours

***** Ticket 4 [RESOLVED] *****
Reported by: Rogier
Reported time: 09-03-2019 11:15:40
Issue: How can I connect a mouse to my computer?

Resolved by: Peter [Troubleshooter] Researcher, HBO-ICT
Solution: A mouse contains a USB-connector which attached to the USB-port of the system. It is a simple plug and play operation which you can perform yourself.
Solved time: 11-03-2019 09:45:56
Duration: 46.5 hours

***** Ticket 5 [UNRESOLVED] *****
Reported by: Vincent
Reported time: 03-03-2020 08:00:01
Issue: Help, my computer contains a virus. Is it contagious to humans?

***** Ticket 6 [UNRESOLVED] *****
Reported by: Ruud
Reported time: 05-01-2021 17:15:23
Issue: I bought a red inktjetprinter. Why does it only print in grayscale?

***** Ticket 7 [RESOLVED] *****
Reported by: Tristan
Reported time: 24-03-2021 10:50:38
Issue: My cat destroyed my mouse.

Resolved by: Erik [Troubleshooter] Lecturer, HBO-ICT
Solution: Buy a new mouse!
Solved time: 24-03-2021 10:57:58
Duration: 0.12 hours

```
Let vooral even op ticket 7: Deze is heel snel afgerond!

```text
-----------
I-Desk
-----------
1. Add ticket
2. Show my tickets
3. Resolve ticket
4. Show open tickets
5. Show all tickets
6. Show users
9. Logout
0. Exit

Choice: 6
-----------
Show all users:
Evert
Ruud
Tristan
Steven
Rogier
Vincent
Oliver [Troubleshooter] Lecturer, HBO-IT
Erik [Troubleshooter] Lecturer, HBO-ICT
Peter [Troubleshooter] Researcher, HBO-ICT
Remco [Troubleshooter] Researcher, HBO-ICT

-----------
I-Desk
-----------
1. Add ticket
2. Show my tickets
3. Resolve ticket
4. Show open tickets
5. Show all tickets
6. Show users
9. Logout
0. Exit

Choice: 0
```