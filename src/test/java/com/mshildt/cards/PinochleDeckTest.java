package com.mshildt.cards;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for PinochleDeck.
 */
public class PinochleDeckTest {

    @Test
    public void canConstruct() {
        PinochleDeck deck = new PinochleDeck();
        assertEquals(48, deck.numCards());
    }

    @Test
    public void canShuffle() {
        PinochleDeck deck = new PinochleDeck();
        deck.shuffle();
        //deck.printCards();
    }

    @Test
    public void canDealOneCard() {
        PinochleDeck deck = new PinochleDeck();

        Card topCard = deck.cards.get(0);
        Card dealtCard = deck.dealOneCard();

        assertEquals(dealtCard, topCard);
    }

    @Test
    public void hasMoreCardsWorks() {
        PinochleDeck deck = new PinochleDeck();

        int numCards = deck.numCards();

        for (int i = 0; i < numCards; i++) {
            assertTrue(deck.hasMoreCards());
            deck.dealOneCard();
        }

        assertFalse(deck.hasMoreCards());
    }
}
