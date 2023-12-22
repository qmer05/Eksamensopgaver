package _3_Kortspil;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    Deck deck;

    public Game() {
        deck = new Deck();
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
