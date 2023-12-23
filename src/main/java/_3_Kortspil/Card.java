package _3_Kortspil;

public class Card {
    private int rank;
    private String suit;

    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        rank += 1;                      // fordi rank går fra 0-12 pga. indeksering

        switch (rank) {
            case 13:
                String rankAce = "ace";
                return rankAce + " of " + suit;
            case 12:
                String rankKing = "king";
                return rankKing + " of " + suit;
            case 11:
                String rankQueen = "queen";
                return rankQueen + " of " + suit;
            case 10:
                String rankKnight = "knight";
                return rankKnight + " of " + suit;
            default:
                return rank + " of " + suit;
        }
    }

    public int getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
}
