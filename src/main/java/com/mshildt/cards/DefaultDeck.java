package com.mshildt.cards;

import java.util.ArrayList;
import java.util.Arrays;

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
    void initCards() {
        cards = new ArrayList<>(Arrays.asList(Card.getAllCards()));
    }
}
