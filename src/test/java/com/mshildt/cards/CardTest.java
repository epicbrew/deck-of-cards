package com.mshildt.cards;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Card tests.
 */
public class CardTest {
    @Test
    public void canConstruct() {
        Card myCard = new Card(Card.Rank.ACE, Card.Suit.SPADES);

        assertEquals(myCard.getRank(), Card.Rank.ACE);
        assertEquals(myCard.getSuit(), Card.Suit.SPADES);
    }

    @Test
    public void getRankWorks() {
        Card myCard = new Card(Card.Rank.FIVE, Card.Suit.DIAMONDS);
        assertEquals(myCard.getRank(), Card.Rank.FIVE);
    }

    @Test
    public void getSuitWorks() {
        Card myCard = new Card(Card.Rank.FIVE, Card.Suit.DIAMONDS);
        assertEquals(myCard.getSuit(), Card.Suit.DIAMONDS);
    }

    @Test
    public void toStringWorks() {
        Card myCard = new Card(Card.Rank.EIGHT, Card.Suit.CLUBS);
        assertEquals("EIGHT of CLUBS", myCard.toString());
    }

    /**
     * This test verifies that getAllCards returns all cards by checking that we
     * have four for each rank/value and thirteen cards for each suit.
     */
    @Test
    public void getAllCardsReturnsAllCards() {
        Card[] cards = Card.getAllCards();

        Map<Card.Rank, Integer> ranks = new HashMap<>();
        Map<Card.Suit, Integer> suits = new HashMap<>();

        for (Card c : cards) {
            Card.Rank cRank = c.getRank();
            Card.Suit cSuit = c.getSuit();

            //
            // Update count for this card's rank.
            //
            if (ranks.containsKey(cRank)) {
                int count = ranks.get(cRank);
                ranks.put(cRank, count + 1);
            }
            else {
                ranks.put(cRank, 1);
            }

            //
            // Update count for this card's suit.
            //
            if (suits.containsKey(cSuit)) {
                int count = suits.get(cSuit);
                suits.put(cSuit, count + 1);
            }
            else {
                suits.put(cSuit, 1);
            }
        }

        //
        // We should have four 13 ranks in our ranks map and each rank should have
        // a count of 4.
        //
        assertEquals(13, ranks.size());
        for (int i : ranks.values()) {
            assertEquals(4, i);
        }

        //
        // We should have 4 suits in our suits map and each suit should have a count
        // of 13.
        //
        assertEquals(4, suits.size());
        for (int i : suits.values()) {
            assertEquals(13, i);
        }
    }
}
