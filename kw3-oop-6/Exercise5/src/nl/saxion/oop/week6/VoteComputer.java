package nl.saxion.oop.week6;

import java.util.*;

public class VoteComputer {
    private Scanner userInputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        VoteComputer computer = new VoteComputer();
//        computer.readCandidates("Exercise5/candidates.csv");
//        computer.generateRandomVotes(20000);
//        computer.runMainMenu();
    }

    /**
     * Method that prints the main menu and asks the user for selecting the main option.
     */
    private void runMainMenu() {
        int input = -1;

        while (input != 9) {
            System.out.println("*************************************************");
            System.out.println("*** Vote Computer (2021)                      ***");
            System.out.println("*************************************************");
            System.out.println("** 1). Vote                                   ***");
            System.out.println("** 2). Calculate results                      ***");
            System.out.println("** 9). Quit                                   ***");
            System.out.println("*************************************************");
            System.out.print("Please make a choice: ");

            input = userInputScanner.nextInt();

            if (input == 1) {
                // TODO: implement this!
            } else if (input == 2) {
                // TODO: implement this!
            }
        }
    }


//    /**
//     * Method for creating random votes.
//     * @param numVotes Number of votes to generate.
//     */
//    public void generateRandomVotes(int numVotes) {
//        // Find all candidates of all political parties.
//        ArrayList<Candidate> allCandidates = new ArrayList<>();
//        for (PoliticalParty party : politicalParties) {
//            allCandidates.addAll(party.getCandidates());
//        }
//
//        // Pick a random candidate and add a vote.
//        Random random = new Random();
//        for (int i = 1; i <= numVotes; i++) {
//            Candidate c = allCandidates.get(random.nextInt(allCandidates.size()));
//            votes.add(new Vote(i, c));
//        }
//    }
}
