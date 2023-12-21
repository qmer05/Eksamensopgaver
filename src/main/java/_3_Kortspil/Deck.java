package _3_Kortspil;

import java.util.ArrayList;

public class Deck {

    public Deck(){
        ArrayList <Card> cards = new ArrayList<>();
        for (int i = 0; i < 13; i++){
            cards.add(new Card(i,1));
        }

    }

}
