package com.mshildt.cards;

import java.util.ArrayList;

/**
 * Represents a deck of cards with one of each card.
 */
public class DefaultDeck extends AbstractDeck {

    /**
     * Default constructor.
     */
    public DefaultDeck() {
        initCards();
    }

    /**
     * Initializes internal list/deck of cards. Initialized cards are in an
     * unspecified, but unshuffled order.
     */
    @Override
    protected void initCards() {
        cards = new ArrayList<>();

        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }
}
