package _5_To_slags_spillere;

import java.util.Scanner;

public class HumanPlayer implements Player {
    public int makeAGuess() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 1-10: ");
        return Integer.parseInt(sc.nextLine());
    }
}
