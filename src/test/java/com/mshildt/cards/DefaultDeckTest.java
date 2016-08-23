package com.mshildt.cards;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by mshildt on 8/23/16.
 */
public class DefaultDeckTest {

    @Test
    public void canConstruct() {
        DefaultDeck deck = new DefaultDeck();
        System.out.println("\n---- CARDS ----");
        deck.printCards();
    }

    @Test
    public void canShuffle() {
        DefaultDeck deck = new DefaultDeck();
        deck.shuffle();
        System.out.println("\n---- CARDS ----");
        deck.printCards();
    }

    @Test
    public void canDealOneCard() {
        DefaultDeck deck = new DefaultDeck();
        Card card = deck.dealOneCard();
        System.out.println("canDealOneCard: " + card);
    }
}
