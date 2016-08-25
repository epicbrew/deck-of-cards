package com.mshildt.cards;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Tests for DefaultDeck.
 */
public class DefaultDeckTest {

    @Test
    public void canConstruct() {
        DefaultDeck deck = new DefaultDeck();
        assertEquals(deck.numCards(), 52);
    }

    @Test
    public void canShuffle() {
        DefaultDeck deck = new DefaultDeck();
        deck.shuffle();
        //deck.printCards();
    }

    @Test
    public void canDealOneCard() {
        DefaultDeck deck = new DefaultDeck();

        Card topCard = deck.cards.get(0);
        Card dealtCard = deck.dealOneCard();

        assertEquals(dealtCard, topCard);
    }

    @Test
    public void hasMoreCardsWorks() {
        DefaultDeck deck = new DefaultDeck();

        int numCards = deck.numCards();

        for (int i = 0; i < numCards; i++) {
            assertTrue(deck.hasMoreCards());
            deck.dealOneCard();
        }

        assertFalse(deck.hasMoreCards());
    }
}
