# Fitnessclub "Merlin" (45 min)
Fitnessclub "Merlin" staat op het punt om een programma aan te schaffen dat hun gasten in staat stelt om geheel automatisch
een eigen fitness programma, ook wel een `Routine` genoemd, op te stellen. Dit programma hoeft alleen nog maar gemaakt
te worden, wat het doel is van deze opdracht.

Een routine is opgesteld uit verschillende individuele oefeningen. Er zijn twee soorten oefeningen opgenomen in het 
systeem: cardio- en krachtoefeningen. Van elke oefening wordt in elk geval de _naam van de oefening_ en de _tijdsduur_ 
van elke oefening vastgelegd. Verder worden van cardio-oefeningen opgeslagen wat de afstand is die afgelegd moet worden
en van krachtoefeningen wordt vastgelegd of de oefening op _hoog tempo_ moet worden uitgevoerd (of niet). Van elke 
oefening kan vervolgens berekend worden hoeveel kilocalorieën je hebt verbrand. Gebruik hiervoor de volgende berekening:

| Soort oefening        | Formule           |
| ------------- |:-------------:|
| Cardio     | `tijdsduur * 20` |
| Kracht (hoog tempo)      | `tijdsduur * 15`      |
| Kracht (normaal tepo) | `tijdsduur * 10`     |

(Voorbeeld: Als je dus 20 minuten zwemt (cardio-oefening), dan verbrand je 400 kilocalorieen.)

Alle oefeningen zijn vastgelegd in het `exercises.csv` bestand. Dit bestand ziet er als volgt uit:
```text
cardio,swimming,20,0.3
strength,bicep curls,10,false
```
(Toelichting: De eerste "cardio" oefening heet "swimming" (zwemmen) en duurt 20 minuten. Je legt hierbij 0.3 km af. De 
tweede "strength" (kracht) oefening heet "bicep curls", duurt 10 minuten en moet op laag tempo worden uitgevoerd.)

Om een goede routine te kunnen bepalen dient de gebruiker het aantal minuten op te geven dat de routine (ongeveer) mag 
duren. De computer zal vervolgens willekeurig oefeningen toevoegen aan de routine. Hierbij maakt het niet uit of het kracht-
of cardio-oefeningen zijn, maar _een oefening mag nooit twee keer voorkomen in dezelfde routine_.

Het kan dus best zijn dat een totale routine uit veel meer cardio-oefeningen bestaat dan uit krachtoefeningen (of omgekeerd).
Dit is voor deze versie van het programma geen probleem. Ook het feit dat je door het toevoegen van oefeningen mogelijk 
iets over het aantal minuten dat de gebruiker ingevoerd heeft, is geen probleem.

Bij het weergeven van het totaaloverzicht van de oefeningen worden alle oefeningen getoond op volgorde van 
calorieverbranding: de opdrachten waar je het meeste mee verbrand, staan bovenaan!

## Eisen
- Je gebruikt de technieken die je in deze module geleerd hebt. (Dus gebruik overerving, encapsulatie, etc.)
- Je programma moet vragen om de naam van de gebruiker en het aantal minuten dat de routine (ongeveer) mag duren.
- Je programma bepaald willekeurig de oefeningen die tot de routine behoren. Hierbij mag willekeurig gekozen worden uit
  kracht- en cardio-oefeningen.
  - Let op: Dezelfde oefening mag **niet** twee keer voorkomen in dezelfde routine!
- Elke oefening kent een duidelijke `toString()` die de details laat zien van de desbetreffende oefening.
- De oefeningen worden getoond op volgorde van verbranding: de oefeningen waar je de meeste calorieën verbrandt staan boven aan.
- Aan het eind wordt getoond hoeveel krachtoefeningen en hoeveel cardio-oefeningen er in de routine zitten.
- Verder wordt getoond hoe lang de gehele routine duurt en hoeveel calorieën er in totaal verband worden.

## Voorbeelduitvoer
De interface is eenvoudig, maar laat wel precies zien wat je moet implementeren.

```text
Please enter the clients name: Tristan
Please enter the target time: 60
The routine for Tristan for today is: 
	swimming for 20 minutes, burning 400 kcal (1.0 km)
	rowing for 15 minutes, burning 300 kcal (2.0 km)
	spinning for 10 minutes, burning 200 kcal (2.0 km)
	chest press for 12 minutes, burning 120 kcal (normal)
	bench press for 10 minutes, burning 100 kcal (normal)

Nr of cardio exercises: 3
Nr of strength exercises: 2

Total duration: 67 minutes
Total calories burned: 1120 kcal
```