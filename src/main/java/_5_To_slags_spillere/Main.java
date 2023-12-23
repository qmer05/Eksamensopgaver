package _5_To_slags_spillere;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rd = new Random();
        HumanPlayer humanPlayer = new HumanPlayer();
        ComputerPlayer computerPlayer = new ComputerPlayer(10);

        int rdNumber = rd.nextInt(1, computerPlayer.getMaxValue() + 1);
        int humanGuess = humanPlayer.makeAGuess();
        int computerGuess = computerPlayer.makeAGuess();

        if (rdNumber == humanGuess && rdNumber == computerGuess) {
            System.out.println("You and the computer guessed right! The number was " + rdNumber);
        } else if (rdNumber == computerGuess) {
            System.out.println("Computer guessed right! The number was " + rdNumber);
        } else if (rdNumber == humanGuess) {
            System.out.println("You guessed right! The Number was " + rdNumber);
        } else {
            System.out.println("Neither you or the computer guessed right. The number was " + rdNumber);
        }
    }
}
