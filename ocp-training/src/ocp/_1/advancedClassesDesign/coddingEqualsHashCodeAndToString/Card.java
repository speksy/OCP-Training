package ocp._1.advancedClassesDesign.coddingEqualsHashCodeAndToString;

public class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        if (rank == null || suit == null)
            throw new IllegalArgumentException();
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Card)) return false;
        Card card = (Card) obj;
        return rank.equals(card.rank) && suit.equals(card.suit);
    }

    @Override
    public int hashCode() {
        return rank.hashCode();
    }
}
