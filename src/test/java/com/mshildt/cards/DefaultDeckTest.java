package com.mshildt.cards;

import static org.junit.Assert.assertEquals;
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
        deck.printCards();
    }

    @Test
    public void canDealOneCard() {
        DefaultDeck deck = new DefaultDeck();

        Card topCard = deck.cards.get(0);
        Card dealtCard = deck.dealOneCard();

        assertEquals(dealtCard, topCard);
    }
}
