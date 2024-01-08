package _3_Kortspil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();

        System.out.println("Do you want to play a game of cards? [Y/N]");

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("y")) {
            System.out.println("Which card game do you want to play?\n1) Normal card game\n2) 7-Card game");

            int userInput = Integer.parseInt(scanner.nextLine());

            switch (userInput) {
                case 1:
                    game.playGame();
                    break;
                case 2:
                    game.play7CardGame();
                    break;
            }
        } else if (input.equalsIgnoreCase("n")) {
            System.out.println("Quitting....");
            System.exit(0);
        } else {
            System.out.println("Invalid input\nQuitting...");
            System.exit(0);
        }
    }
}