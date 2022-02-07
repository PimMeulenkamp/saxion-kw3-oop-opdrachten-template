# Tweede kamerverkiezingen 2021
## Moeilijkheid: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) 

Bij deze opdracht gaan we een stemcomputer bouwen voor de Tweede Kamerverkiezingen van 2021.

### Datastructuur
Tijdens de Tweede Kamerverkiezingen strijden er verschillende politieke partijen voor de 150 zetels in de Tweede Kamer.
Iedere partij heeft een lijstnummer en een naam. Daarnaast heeft iedere partij kandidaten die op de lijst van die partij staan.
Iedere kandidaat heeft een positie op de lijst (kandidaatnummer), een voornaam, tussenvoegsel, achternaam en een woonplaats.

In het bestand `candidates.csv` vind je alle kandidaten voor de huidige verkiezingen in district Zwolle.
Het is de bedoeling dat je programma dit bestand inleest bij het opstarten en alle politieke partijen en kandidaten opslaat in het systeem.

### Stemmen
De stemcomputer heeft een menu waarmee we kunnen stemmen. Bij het stemmen zal de gebruiker eerst zijn BSN (persoonsnummer) moet invoeren (een `int` volstaat).
Vervolgens zal de stemcomputer alle mogelijke partijen met lijstnummer en partijnaam tonen en de gebruiker vragen op welke partij hij/zij wil stemmen.
Vervolgens worden alle kandidaten getoond van de gekozen partij en zal het systeem vragen op welke kandidaat de gebruiker wil stemmen.
Als de gebruiker heeft gekozen zal de stem worden opgeslagen. 

Let op dat het niet mogelijk is om meerdere keren te stemmen met hetzelfde BSN-nummer!

### Uitslag bepalen
Tot slot willen we de uitslag van de verkiezingen kunnen tonen. We moeten daarom de stemmen verwerken en 150 zetels verdelen over de partijen.
Je mag de zetels afronden, hierdoor kan het zijn dat het totaal niet meer precies op 150 uitkomt!

We hebben een methode `public void generateRandomVotes(int numVotes)` meegeleverd, waar je een aantal stemmen mee kunt genereren. Op die manier kun je eenvoudig testen of het uitslag bepalen werkt.

## Voorbeeld
De schermen mogen er uiteraard iets anders uit zien.
```text
*************************************************
*** Vote Computer (2021)                      ***
*************************************************
** 1). Vote                                   ***
** 2). Calculate results                      ***
** 9). Quit                                   ***
*************************************************
Please make a choice: 1
Please enter your person number: 5238945
```
Het `person number` is een verwijzing naar je BSN nummer. Een persoon mag immers niet 2x stemmen!

```text
*************************************************
*** Voting                                    ***
*************************************************
1. VVD
2. PVV (Partij voor de Vrijheid)
3. CDA
4. D66
5. GROENLINKS
6. SP (Socialistische Partij)
7. Partij van de Arbeid (P.v.d.A.)
8. ChristenUnie
9. Partij voor de Dieren
10. 50PLUS
11. Staatkundig Gereformeerde Partij (SGP)
12. DENK
13. Forum voor Democratie
14. BIJ1
15. JA21
16. CODE ORANJE
17. Volt
18. NIDA
19. Piratenpartij
20. LP (Libertaire Partij)
21. JONG
22. Splinter
23. BBB
24. NLBeter
25. Lijst Henk Krol
26. OPRECHT
27. JEZUS LEEFT
28. Trots op Nederland (TROTS)
29. U-Buntu Connected Front
32. DE FEESTPARTIJ (DFP)
33. Vrij en Sociaal Nederland
*************************************************
Please make a choice: 32

*************************************************
*** Candidates (32. DE FEESTPARTIJ (DFP)
*************************************************
1. Johan Vlemmix (Leende)
*************************************************
Please make a choice: 1
```
Het maken van een keuze voor een kandidaat bestaat uit twee stappen: Eerst kies je een partij en dan een kandidaat van
die partij. Wij hebben de uitvoer van deze twee stappen hierboven gecombineerd. Merk op dat partijen een verschillend
aantal kandidaten kunnen hebben.

Hieronder herhalen wij het gehele proces nog een keer voor de duidelijkheid:

```text
*************************************************
*** Vote Computer (2021)                      ***
*************************************************
** 1). Vote                                   ***
** 2). Calculate results                      ***
** 9). Quit                                   ***
*************************************************
Please make a choice: 1
Please enter your person number: 3482893

*************************************************
*** Voting                                    ***
*************************************************
1. VVD
2. PVV (Partij voor de Vrijheid)
3. CDA
4. D66
5. GROENLINKS
6. SP (Socialistische Partij)
7. Partij van de Arbeid (P.v.d.A.)
8. ChristenUnie
9. Partij voor de Dieren
10. 50PLUS
11. Staatkundig Gereformeerde Partij (SGP)
12. DENK
13. Forum voor Democratie
14. BIJ1
15. JA21
16. CODE ORANJE
17. Volt
18. NIDA
19. Piratenpartij
20. LP (Libertaire Partij)
21. JONG
22. Splinter
23. BBB
24. NLBeter
25. Lijst Henk Krol
26. OPRECHT
27. JEZUS LEEFT
28. Trots op Nederland (TROTS)
29. U-Buntu Connected Front
32. DE FEESTPARTIJ (DFP)
33. Vrij en Sociaal Nederland
*************************************************
Please make a choice: 19

*************************************************
*** Candidates (19. Piratenpartij
*************************************************
1. Matthijs Pontier (Amsterdam)
2. Ji Yong Dijkhuis (Lelystad)
3. Saira Sadloe (Purmerend)
4. David van Deijk (Eindhoven)
5. Jasmijn Boeken (Beuningen Gld)
6. Wietze Brandsma (Burgum)
7. Petra Downs-Hovestadt (Helmond)
8. Mark van Treuren (Schagen)
9. Astrid Abendroth (Amsterdam)
10. Danny Werner (Amsterdam)
11. André Linnenbank (Zaandam)
12. Dmitri Schrama (Utrecht)
13. Leontien Wafelman (Amsterdam)
14. Dylan Hallegraeff ('s-Gravenhage)
15. Frank Wijnans (Idsegahuizum)
16. Tjerk Feitsma (Amstelveen)
17. Bob Sikkema (Enkhuizen)
18. Edy Bouma (Ede)
19. Robert Kwakkelstein ('s-Gravenhage)
20. Thijs Ligthart (Alkmaar)
21. Peter ter Haak (Lisse)
22. Melchior Philips (Arnhem)
23. Dave Borghuis ook genaamd op de Borg (Enschede)
24. Rick Piepers (Amsterdam)
25. Teunis van Nes (Goes)
26. Mirjam van Rijn (Amsterdam)
27. Dirk Poot (Hoeven)
28. Metje Blaak (Amsterdam)
*************************************************
Please make a choice: 13

*************************************************
*** Vote Computer (2021)                      ***
*************************************************
** 1). Vote                                   ***
** 2). Calculate results                      ***
** 9). Quit                                   ***
*************************************************
Please make a choice: 2
```
Als je de resultaten wil tonen moet je het aantal stemmen gaan omrekenen naar een verdeling over de 150 zetels. Je
hoeft van een partij alleen maar te laten zien wat het lijstnummer van de partij is, de partijnaam en het aantal zetels.

```text
*************************************************
*** Results                                   ***
*************************************************
4. D66=12
1. VVD=11
8. ChristenUnie=8
3. CDA=8
7. Partij van de Arbeid (P.v.d.A.)=8
5. GROENLINKS=7
16. CODE ORANJE=7
9. Partij voor de Dieren=7
6. SP (Socialistische Partij)=7
2. PVV (Partij voor de Vrijheid)=7
13. Forum voor Democratie=7
10. 50PLUS=6
20. LP (Libertaire Partij)=5
11. Staatkundig Gereformeerde Partij (SGP)=5
18. NIDA=4
17. Volt=4
15. JA21=4
23. BBB=4
19. Piratenpartij=4
28. Trots op Nederland (TROTS)=3
29. U-Buntu Connected Front=3
25. Lijst Henk Krol=3
14. BIJ1=3
12. DENK=3
26. OPRECHT=2
21. JONG=2
22. Splinter=2
24. NLBeter=2
33. Vrij en Sociaal Nederland=1
32. DE FEESTPARTIJ (DFP)=0
27. JEZUS LEEFT=0
*************************************************
*** Vote Computer (2021)                      ***
*************************************************
** 1). Vote                                   ***
** 2). Calculate results                      ***
** 9). Quit                                   ***
*************************************************
Please make a choice: 
```