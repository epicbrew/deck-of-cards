package com.mshildt.cards;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

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
}
