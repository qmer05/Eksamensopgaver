package _3_Kortspil;

public class Card {
    private int rank;
    private int suit;

    public Card(int rank, int suit){
        this.rank = rank;
        this.suit = suit;
    }

    public String toString(){
        return rank + " of " + suit;
    }
}
