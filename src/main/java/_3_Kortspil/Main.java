package _3_Kortspil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();

        System.out.println("Do you want to play a game of cards? [Y/N]");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("y")) {
            game.playGame();
        } else if (input.equalsIgnoreCase("n")) {
            System.out.println("Quitting....");
            System.exit(0);
        } else {
            System.out.println("Invalid input\nQuitting...");
        }
    }
}