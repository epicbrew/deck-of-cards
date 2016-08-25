package com.mshildt.cards;

/**
 * Represents a single card in a Deck.
 */
public class Card {

    /**
     * Represents a card's rank (or value).
     */
    public enum Rank {
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE
    }

    /**
     * Represents a card's suit.
     */
    public enum Suit {
        HEARTS,
        DIAMONDS,
        SPADES,
        CLUBS
    }

    /**
     * The card's rank (immutable).
     */
    private final Rank rank;

    /**
     * The card's suit (immutable).
     */
    private final Suit suit;

    /**
     * Constructor.
     * @param rank The rank of the card.
     * @param suit The suit of the card.
     */
    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    /**
     * Get the card's rank.
     * @return Card's rank.
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * Get the card's suit.
     * @return Card's suit.
     */
    public Suit getSuit() {
        return suit;
    }


    public static Card[] getAllCards() {
        Card[] cards = new Card[52];

        int i = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[i] = new Card(rank, suit);
                i++;
            }
        }

        return cards;
    }

    @Override
    public String toString() {
        return this.rank.toString() + " of " + this.suit.toString();
    }
}
