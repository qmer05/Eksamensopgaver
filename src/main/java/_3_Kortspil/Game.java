package _3_Kortspil;

import java.util.Random;
import java.util.Scanner;

public class Game {
    Deck deck;

    public Game() {
        deck = new Deck();
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        Card playerCard = drawCard();
        Card opponentCard = drawCard();
        Card winningCard = highest(playerCard, opponentCard);

        System.out.println("You drew " + playerCard + "\nOpponent drew " + opponentCard);

        if (playerCard.equals(winningCard)) {
            System.out.println("You won!");
        } else {
            System.out.println("Opponent won");
        }

        if (deck.cards.size() > 0) {
            System.out.println("Would you like to try again? [Y/N]");

            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Y")) {
                playGame();
            } else {
                System.out.println("Quitting...");
                System.exit(0);
            }
        } else {
            System.out.println("No cards left\nQuitting...");
            System.exit(0);
        }
    }

    public Card drawCard() {
        Random rd = new Random();
        Card randomCard = deck.cards.get(rd.nextInt(deck.cards.size()));
        deck.cards.remove(randomCard);
        return randomCard;
    }

    public Card highest(Card card1, Card card2) {
        if (card1.getRank() > card2.getRank()) {
            return card1;
        } else if (card2.getRank() > card1.getRank()) {
            return card2;
        } else if (card1.getRank() == card2.getRank()) {
            if (card1.getSuit().equals("spades")) {
                return card1;
            } else if (card1.getSuit().equals("hearts") && !card2.getSuit().equals("spades")) {
                return card1;
            } else if (card1.getSuit().equals("diamond") && !card2.getSuit().equals("spades") && !card2.getSuit().equals("hearts")) {
                return card1;
            } else {
                return card2;
            }
        }
        return null;
    }
}
