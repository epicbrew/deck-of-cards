package com.mshildt.cards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A class representing a deck for the game Pinochle. A pinochle deck has two of each
 * of 9 through ace cards for every suit for a total of 48 cards.
 */
public class PinochleDeck extends AbstractDeck {

    /**
     * Default constructor.
     */
    public PinochleDeck() {
        initCards();
    }

    /**
     * Initializes a deck for the game Pinochle.
     */
    @Override
    void initCards() {
        this.cards = new ArrayList<>();
        addPinocleCards();
        addPinocleCards();
    }

    /**
     * Adds one set of 9 through ace cards for every suit.
     */
    private void addPinocleCards() {
        Card[] allCards = Card.getAllCards();

        List<Card> pinochleCards = new ArrayList<>();

        for (Card c : allCards) {
            if (c.getRank().ordinal() >= Card.Rank.NINE.ordinal()) {
                pinochleCards.add(c);
            }
        }

        this.cards.addAll(pinochleCards);
    }

}
