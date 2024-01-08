package _5_To_slags_spillere;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxValue = 10;

        Random rd = new Random();
        int rdNumber = rd.nextInt(1, maxValue + 1);

        System.out.println("""
                Please select an option:
                1) Two human players
                2) One human and one computer player
                3) One computer player""");

        int input = Integer.parseInt(scanner.nextLine());

        switch (input) {
            case 1:
                HumanPlayer humanPlayer1 = new HumanPlayer();
                HumanPlayer humanPlayer2 = new HumanPlayer();

                System.out.println("First player");
                int humanGuess1 = humanPlayer1.makeAGuess(maxValue);
                System.out.println("Second player");
                int humanGuess2 = humanPlayer2.makeAGuess(maxValue);

                if (rdNumber == humanGuess1 && rdNumber == humanGuess2) {
                    System.out.println("Both of you guessed right! The number was " + rdNumber);
                } else if (rdNumber == humanGuess2) {
                    System.out.println("Second player guessed right! The number was " + rdNumber);
                } else if (rdNumber == humanGuess1) {
                    System.out.println("First player guessed right! The Number was " + rdNumber);
                } else {
                    System.out.println("Neither of you guessed right. The number was " + rdNumber);
                }
                break;

            case 2:
                HumanPlayer humanPlayer = new HumanPlayer();
                ComputerPlayer computerPlayer = new ComputerPlayer();

                int humanGuess = humanPlayer.makeAGuess(maxValue);
                int computerGuess = computerPlayer.makeAGuess(maxValue);

                if (rdNumber == humanGuess && rdNumber == computerGuess) {
                    System.out.println("You and the computer guessed right! The number was " + rdNumber);
                } else if (rdNumber == computerGuess) {
                    System.out.println("Computer guessed right! The number was " + rdNumber);
                } else if (rdNumber == humanGuess) {
                    System.out.println("You guessed right! The Number was " + rdNumber);
                } else {
                    System.out.println("Neither you or the computer guessed right. The number was " + rdNumber);
                }
                break;

            case 3:
                ComputerPlayer computerPlayer1 = new ComputerPlayer();
                int computerGuess1 = computerPlayer1.makeAGuess(maxValue);

                if (rdNumber == computerGuess1) {
                    System.out.println("Computer guessed right! The number was " + rdNumber);
                } else {
                    System.out.println("The computer didn't guess right. The number was " + rdNumber);
                }
                break;
        }
    }
}
