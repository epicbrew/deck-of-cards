package com.mshildt.cards;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Tests for StandardDeck.
 */
public class StandardDeckTest {

    @Test
    public void canConstruct() {
        StandardDeck deck = new StandardDeck();
        assertEquals(52, deck.numCards());
    }

    @Test
    public void shuffleWorks() throws EmptyDeckException {
        StandardDeck unshuffledDeck = new StandardDeck();
        StandardDeck shuffledDeck = new StandardDeck();

        shuffledDeck.shuffle();

        //
        // We'll use this value to track how many of the cards are in different
        // positions between the shuffled and unshuffled decks.
        //
        int differences = 0;

        while (shuffledDeck.hasMoreCards() && unshuffledDeck.hasMoreCards()) {
            Card c1 = unshuffledDeck.dealOneCard();
            Card c2 = shuffledDeck.dealOneCard();

            if (c1.getRank() != c2.getRank() || c1.getSuit() != c2.getSuit()) {
                differences++;
            }
        }
        
        //
        // This is kind of a low bar for validating the shuffle algorithm, but
        // quantifying the randomness of the shuffled deck against the unshuffled
        // one is beyond the scope of this test.
        //
        assertTrue(differences > 10);
    }

    @Test
    public void canDealOneCard() {
        StandardDeck deck = new StandardDeck();

        Card topCard = deck.cards.get(0);
        Card dealtCard = null;

        try {
            dealtCard = deck.dealOneCard();
        }
        catch (EmptyDeckException ex) {
            fail("deck should never be empty here");
        }

        assertEquals(dealtCard, topCard);
    }

    @Test
    public void hasMoreCardsWorks() {
        StandardDeck deck = new StandardDeck();

        int numCards = deck.numCards();

        //
        // Call has more cards once for every card in the deck.
        //
        for (int i = 0; i < numCards; i++) {
            assertTrue(deck.hasMoreCards());

            try {
                deck.dealOneCard();
            }
            catch (EmptyDeckException ex) {
                fail("EmptyDeckException thrown when hasMoreCards was true");
            }
        }

        assertFalse(deck.hasMoreCards());
    }
}
