package _3_Kortspil;

import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;
    private String[] suits = {"spades", "hearts", "diamonds", "clubs"};


    public Deck() {

        int numberOfRanks = 13;

        cards = new ArrayList<>();
        for (String suit : suits) {
            for (int i = 0; i < numberOfRanks; i++) {
                cards.add(new Card(i, suit));
            }
        }
    }

    public String displayCardDeck() {
        StringBuilder sb = new StringBuilder();
        for (Card c : cards) {
            sb.append(c + "\n");
        }
        System.out.println(sb);
        return sb.toString();
    }

    public String[] getSuits(){
        return suits;
    }

    public ArrayList<Card> getCards(){
        return cards;
    }


}
