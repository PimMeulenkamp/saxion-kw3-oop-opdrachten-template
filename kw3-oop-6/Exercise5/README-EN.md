# Parliament elections in the Netherlands 2021
## Difficulty: ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg) ![Filled](../resources/star-filled.svg)

In this assignment, we are going to build a voting computer for the 2021 House of Representatives elections in the Netherlands.
Please note that all names and parties are of Dutch origin, so understanding their names (sometimes) might be a bit tricky.

### Data structure
During the House of Representatives elections, different political parties compete for the 150 seats in the House of 
Representatives. Each party has a list number and a name. In addition, each party has candidates who are on that party's 
list. Each candidate has a position on the list (also known as the candidate number), a first name, infix (Dutch last
names are sometimes split in two parts, like _van der_, if you are in doubt, just combine infix with last name), last
name and a place of residence.

In the file `candidates.csv` you will find all candidates for the current elections in the Zwolle district. Your program 
should read this file at startup and store all political parties and candidates in the system.

### Voting
The voting computer has a menu that allows a person to vote. When voting, the user will first have to enter his BSN 
(personal number) (an `int` will do, in the Netherlands there are rules to this number, but we'll ignore those for now). 
The voting computer will show all possible parties with list number and party name and ask the user which party he/she wants 
to vote for. Next, all candidates of the chosen party will be shown and the system will ask which candidate the user 
wants to vote for. Once the user has chosen, the vote will be saved.

Please note that it is not possible to vote multiple times with the same BSN number!

### Determine result
Finally, we want to be able to display the results of the election. We therefore need to process the votes and divide 
150 seats among the parties. You may round off the seats, this may cause the total to not be exactly 150!

We have included a method `public void generateRandomVotes(int numVotes)`, with which you can generate a number of 
votes. That way you can easily test if the result determination works.

## Example
The screens obviously can differ with regards to looks, but stick to the functionality!
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
The `person number` references the BSN number discussed earlier. Each person has an unique identifier this way.
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
Voting for a candidate consists of two steps: First, you choose a party and then a candidate from that party. We have 
combined the output of these two steps above. Note that parties can have a different number of candidates.

Below we repeat the entire process again for clarity:

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
If you want to show the results you have convert all votes into individual seats (this requires a bit of math!). You
only have to show the list number of a party, the party name and the number of seats.

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