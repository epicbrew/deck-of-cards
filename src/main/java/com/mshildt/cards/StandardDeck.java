package com.mshildt.cards;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Represents a standard deck of cards with one of each card.
 */
public class StandardDeck extends AbstractDeck {

    /**
     * Default constructor.
     */
    public StandardDeck() {
        initCards();
    }

    /**
     * Initializes internal list/deck of cards. Initialized cards are in an
     * unspecified, but unshuffled order.
     */
    @Override
    void initCards() {
        this.cards = new ArrayList<>(Arrays.asList(Card.getAllCards()));
    }
}
