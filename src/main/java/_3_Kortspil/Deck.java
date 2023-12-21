package _3_Kortspil;

import java.util.ArrayList;

public class Deck {

    public Deck(){

        String[] suits = {"heart", "diamond", "spade", "club"};
        int numberOfRanks = 13;

        ArrayList <Card> cardDeck = new ArrayList<>();
        for (String suit : suits){
            for (int i = 0; i < numberOfRanks; i++){
                cardDeck.add(new Card(i + "", suit));
            }
        }

        System.out.println(cardDeck);


    }

}
