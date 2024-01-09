package _5_To_slags_spillere;

import java.util.Random;

public class ComputerPlayer implements Player {

    public int makeAGuess(int maxValue) {
        Random rd = new Random();
        int computerGuess = rd.nextInt(1, maxValue);
        System.out.println("The computer guessed " + computerGuess);
        return computerGuess;
    }
}
