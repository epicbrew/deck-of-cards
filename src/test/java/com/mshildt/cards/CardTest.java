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
}
