package _3_Kortspil;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private Deck deck;

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
            System.out.println("Opponent won.");
        }

        if (deck.getCards().size() > 0) {
            System.out.println("Would you like to try again? [Y/N]");

            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("y")) {
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
        Card randomCard = deck.getCards().get(rd.nextInt(deck.getCards().size()));
        deck.getCards().remove(randomCard);
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
            } else if (card1.getSuit().equals("diamonds") && !card2.getSuit().equals("spades") && !card2.getSuit().equals("hearts")) {
                return card1;
            } else {
                return card2;
            }
        }
        return null;
    }

    public void play7CardGame(){
        ArrayList<Card> playerCards = new ArrayList<>();
        ArrayList<Card> opponentCards = new ArrayList<>();

        while (opponentCards.size() < 7){
            playerCards.add(drawCard());
            opponentCards.add(drawCard());
        }

        for (int i = 0; i < opponentCards.size(); i++) {
            if (playerCards.get(i).getRank() > opponentCards.get(i).getRank()){
                System.out.println("You played " + playerCards.get(i));
                System.out.println("Opponent played " + opponentCards.get(i));
            }
        }

        System.out.println("Player cards: " + playerCards);
        System.out.println("Opponent cards: " + opponentCards);

    }
}
